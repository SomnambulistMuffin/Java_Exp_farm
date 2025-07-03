Public Class BankAccount
    Inherits frmTransactions

    Private AccNum As String
    Public Property _accnum() As String
        Get
            Return AccNum
        End Get
        Set(ByVal value As String)
            AccNum = value
        End Set
    End Property
    Private AccBalance As Double
    Public Property _accBal() As Double
        Get
            Return AccBalance
        End Get
        Set(ByVal value As Double)
            AccBalance = value
        End Set
    End Property
    Private AccType As String
    Public Property _acctype() As String
        Get
            Return AccType
        End Get
        Set(ByVal value As String)
            AccType = value
        End Set
    End Property
    Private AccOlder As String
    Public Property _accOlder() As String
        Get
            Return AccOlder
        End Get
        Set(ByVal value As String)
            AccOlder = value
        End Set
    End Property
    Private AccContact As String
    Public Property _acccontact() As String
        Get
            Return AccContact
        End Get
        Set(ByVal value As String)
            AccContact = value
        End Set
    End Property

    Public Sub New()
        AccBalance = 0
        AccContact = String.Empty
        AccNum = String.Empty
        AccOlder = String.Empty
        AccType = String.Empty


    End Sub
    Public Sub New(ByVal Accnumb As String, ByVal Accbal As Double, ByVal Acctype As String, ByVal Accolder As String, ByVal Acccontact As String)
        Accbal = _accBal
        Accnumb = _accnum
        Acctype = _acctype
        Accolder = _accOlder
        Acccontact = _acccontact


    End Sub

    Public Overrides Function ToString() As String
        Return _accnum + ", " + _accBal + ", " + _acctype + ", " + _accOlder + ", " + _acccontact

    End Function
End Class
