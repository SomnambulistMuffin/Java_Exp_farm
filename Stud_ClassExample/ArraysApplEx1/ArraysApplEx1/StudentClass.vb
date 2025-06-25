Public Class studentClass
    'instance variables
    Private _stdno, _subjectcode As String
    Private _marks As Integer

    'method members
    'property variables for all instance variables

    Public Property stdno() As String
        Get
            Return _stdno
        End Get
        Set(value As String)
            _stdno = value
        End Set
    End Property

    Public Property subjectcode() As String
        Get
            Return _subjectcode
        End Get
        Set(value As String)
            _subjectcode = value
        End Set
    End Property
    Public Property marks() As Integer
        Get
            Return _marks
        End Get
        Set(value As Integer)
            _marks = value
        End Set
    End Property


    Public Sub New()
        _stdno = ""
        _subjectcode = ""
        _marks = 0


    End Sub


    Public Sub New()

    End Sub
End Class
