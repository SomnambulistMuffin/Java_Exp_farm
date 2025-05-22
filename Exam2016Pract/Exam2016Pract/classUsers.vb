Imports System.Data.SqlClient




Public Class classUsers

    Private _connstring As String
    Public Property Connstring() As String
        Get
            Return _connstring
        End Get
        Set(ByVal value As String)
            _connstring = value
        End Set
    End Property
    Private _connstringuser As String
    Public Property Connstringuser() As String
        Get
            Return _connstringuser
        End Get
        Set(ByVal value As String)
            _connstringuser = value
        End Set
    End Property

    Private _DOB As String
    Public Property DOB() As String
        Get
            Return _DOB
        End Get
        Set(ByVal value As String)
            _DOB = value
        End Set
    End Property

    Private _email As String
    Public Property Email() As String
        Get
            Return _email
        End Get
        Set(ByVal value As String)
            _email = value
        End Set
    End Property
    Private _name As String
    Public Property Name() As String
        Get
            Return _name
        End Get
        Set(ByVal value As String)
            _name = value
        End Set
    End Property
    Private _password As String
    Public Property Password() As String
        Get
            Return _password
        End Get
        Set(ByVal value As String)
            _password = value
        End Set
    End Property
    Private _usertID As String
    Public Property UserTypeID() As String
        Get
            Return _usertID
        End Get
        Set(ByVal value As String)
            _usertID = value
        End Set
    End Property

    Public Sub New()
        Connstring = My.Settings.OrderDBConnString
        Connstringuser = My.Settings.NUserDBConnString
        Name = " "
        DOB = " "
        Email = " "
        Password = " "
        UserTypeID = 0
    End Sub

    Public Sub New(ByVal theemail As String)
        Connstring = My.Settings.OrderDBConnString
        Connstringuser = My.Settings.NUserDBConnString
        Name = " "
        DOB = " "
        Email = theemail
        Password = " "
        UserTypeID = 0
    End Sub

    Public Sub New(ByVal theemail As String, ByVal thepassword As String, ByVal theName As String, ByVal theDOB As String)
        Connstring = My.Settings.OrderDBConnString
        Connstringuser = My.Settings.NUserDBConnString

        Name = theName
        DOB = theDOB
        Email = theemail
        Password = thepassword
        UserTypeID = 0
    End Sub

    Public Sub GetUserdata(ByVal theEmail As String, ByVal theUserType As String, ByVal theName As String, ByVal theDOB As String, ByVal thepass As String)
        Dim myConn As New SqlConnection(My.Settings.NUserDBConnString)
        Dim myCommand As New SqlCommand("SELECT * FROM tblUsers WHERE Email = @paremail " & "AND Password = @parPassword," & " AND Name = @parName" & "AND DOB = @ parDOB", myConn)
        Dim myAdapter As New SqlDataAdapter(myCommand)
        Dim mytable As New DataTable
        Dim objRow As DataRow

        'myCommand.Parameters.Add("@paremail", SqlDbType.VarChar).Value = theEmail
        'myCommand.Parameters.Add("@parpassword", SqlDbType.VarChar).Value = thepass

        'myConn.Open()
        'myAdapter.Fill(mytable)

        'myConn.Close()

        If Not IsNothing(theEmail) Then
            myCommand.Parameters.Add("@parName", SqlDbType.VarChar).Value = theName
            myCommand.Parameters.Add("@parDOB", SqlDbType.VarChar).Value = theDOB
            myCommand.Parameters.Add("@parUserTypeID", SqlDbType.VarChar).Value = theUserType
            myCommand.Parameters.Add("@parpassword", SqlDbType.VarChar).Value = thepass

            myConn.Open()
            myAdapter.Fill(mytable)
            myConn.Close()

            objRow = mytable.Rows(0)

            theName = objRow("Name")
            thepass = objRow("Password")
            theDOB = objRow("DOB")

        End If
    End Sub
    Public Sub UpdateUserData(ByVal theEmail As String, ByVal thePassword As String, ByVal theName As String, ByVal theDOB As String)
        Dim myConn As New SqlConnection(My.Settings.NUserDBConnString)
        Dim myCommand As New SqlCommand("UPDATE tblUsers SET Name = @parName," & " Password = @parPass" & ", Email = @parEmail, DOB = @parDOB WHERE Email = @parEmail", myConn)

        myCommand.Parameters.Add("@parName", SqlDbType.VarChar)
        myCommand.Parameters.Add("@parPass", SqlDbType.VarChar)
        myCommand.Parameters.Add("@parEmail", SqlDbType.VarChar)
        myCommand.Parameters.Add("@parDOB", SqlDbType.VarChar)

        myConn.Open()
        myCommand.ExecuteNonQuery()
        myConn.Close()



    End Sub
End Class
