Imports System.Data.SqlClient

Public Class classUser
    'connection string
    Private _connstring As String
    Public Property Connstring As String
        Get
            Return _connstring
        End Get
        Set(value As String)
            _connstring = value
        End Set


    End Property
    'User fullname
    Private _fullname As String
    Public Property Fullname As String
        Get
            Return _fullname
        End Get
        Set(value As String)
            _fullname = value
        End Set
    End Property
    'User Username
    Private _username As String
    Public Property Username As String
        Get
            Return _username
        End Get
        Set(value As String)
            _username = value
        End Set
    End Property
    'Usertype for permission privileges
    Private _usertype As String
    Public Property Usertype As String
        Get
            Return _usertype
        End Get
        Set(value As String)
            _usertype = value
        End Set
    End Property
    'Department Code
    Private _departmentcode As Integer
    Public Property DepartmentCode As Integer
        Get
            Return _departmentcode
        End Get
        Set(value As Integer)
            _departmentcode = value
        End Set
    End Property
    'User Password
    Private _password As String
    Public Property Password As String
        Get
            Return _password
        End Get
        Set(value As String)
            _password = value
        End Set
    End Property

    'constructors
    'default constructor
    Public Sub New()
        DepartmentCode = 0
        Fullname = ""
        Password = ""
        Username = ""
        Usertype = ""
        Connstring = My.Settings.UserDBConnString
    End Sub

    'Overloaded constructor 1
    Public Sub New(ByVal theUsername As String, ByVal thePass As String)
        Username = theUsername
        Password = thePass
        DepartmentCode = 0
        Fullname = ""
        Usertype = ""
        Connstring = My.Settings.UserDBConnString
    End Sub
    'overloaded constructor 2
    Public Sub New(ByVal theUsername As String, ByVal thePass As String, ByVal theName As String)
        Username = theUsername
        Password = thePass
        DepartmentCode = 0
        Fullname = theName
        Usertype = ""
        Connstring = My.Settings.UserDBConnString
    End Sub

    Public Sub UpdateDetails(ByVal strUsername As String)
        'Update variables
        Dim UpConn As New SqlConnection(Connstring)
        Dim upcommand As New SqlCommand("UPDATE tblUsers SET Password = @parPassw, Fullname = @parFullname WHERE Username= @parUsername", UpConn)

        upcommand.Parameters.Add("@parPassw", SqlDbType.VarChar).Value = Password
        upcommand.Parameters.Add("@parFullname", SqlDbType.VarChar).Value = Fullname
        upcommand.Parameters.Add("@parUsername", SqlDbType.VarChar).Value = Username
        'opening and closing connection
        UpConn.Open()
        upcommand.ExecuteNonQuery()
        UpConn.Close()
    End Sub
    Public Function IsValidLogon() As Boolean
        'Variable definitions
        Dim myCONN As New SqlConnection(Connstring)
        Dim myCOMMAND As New SqlCommand("SELECT Username, Password FROM tblUsers WHERE Username=@parUsername AND Password=@parPassword", myCONN)
        Dim MyAdapter As New SqlDataAdapter(myCOMMAND)
        Dim myTABLE As New DataTable
        Dim objROW As DataRow

        'Parameter allocation
        myCOMMAND.Parameters.Add("@parUsername", SqlDbType.VarChar).Value = Username
        myCOMMAND.Parameters.Add("@parPassword", SqlDbType.VarChar).Value = Password


        'opening and closing connection
        myCONN.Open()
        MyAdapter.Fill(myTABLE)
        myCONN.Close()

        'filling the table with the data
        If myTABLE.Rows.Count > 0 Then
            objROW = myTABLE(0)
            Username = objROW("Username")
            Password = objROW("Password")
            Fullname = objROW("Fullname")
            DepartmentCode = objROW("DepartmentCode")
            Usertype = objROW("Usertype")
            Return Username
            Return Password
        Else
            Return False
        End If
    End Function
End Class
