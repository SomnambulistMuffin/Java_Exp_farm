Imports System.Data.SqlClient
Public Class ClassCustomer

    Private _connstring As String
    Public Property Connstring As String
        Get
            Return _connstring
        End Get
        Set(value As String)
            _connstring = value
        End Set
    End Property

    Private _custAdd As String
    Public Property CustAdd As String
        Get
            Return _custAdd
        End Get
        Set(value As String)
            _custAdd = value
        End Set
    End Property

    Private _custDOB As Date
    Public Property CustDOB As Date
        Get
            Return _custDOB
        End Get
        Set(value As Date)
            _custDOB = value
        End Set
    End Property

    Private _custName As String
    Public Property CustName As String
        Get
            Return _custName
        End Get
        Set(value As String)
            _custName = value
        End Set
    End Property

    Private _custNo As Integer
    Public Property CustNo As Integer
        Get
            Return _custNo
        End Get
        Set(value As Integer)
            _custNo = value
        End Set
    End Property
    Private _custSur As String
    Public Property CustSur As String
        Get
            Return _custSur
        End Get
        Set(value As String)
            _custSur = value
        End Set
    End Property

    Public Sub New()
        Connstring = My.Settings._215079698ConnString
        CustNo = 1
        CustName = " "
        CustSur = " "
        CustAdd = " "



    End Sub
    Public Sub New(ByVal CustNum As Integer, ByVal CusName As String, ByVal CustSurname As String, ByVal CustAddress As String, ByVal DOB As Date)
        Connstring = My.Settings._215079698ConnString
        CustNum = CustNo
        CusName = CustName
        CustSurname = CustSur
        CustAddress = CustAdd
        DOB = CustDOB

    End Sub

    Public Function GetConnection() As String
        Connstring = My.Settings._215079698ConnString
        Return Connstring
    End Function
    Public Sub GetCustomerData()
        Dim myconn As String

        myconn = GetConnection()

        'myconn = GetConnection(Connstring)
        Dim Command As New SqlCommand("SELECT CustNo FROM tblCustomer WHERE CustName = @parCustName AND CustSurname= @parCustSur AND CustDOB = @parCustDOB AND CustAddress = @parCustAddress", Connstring)

        Command.Parameters.Add("@parCustName", SqlDbType.VarChar).Value = CustName
        Command.Parameters.Add("@parCustSurname", SqlDbType.VarChar).Value = CustSur
        Command.Parameters.Add("@parCustDOB", SqlDbType.Date).Value = CustDOB
        Command.Parameters.Add("@parCustAddress", SqlDbType.VarChar).Value = CustAdd



    End Sub
End Class
