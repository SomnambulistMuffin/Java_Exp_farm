Public Class StudentClass
    Private _studno, _subcode As String
    Private _marks As Integer


    Public Property studno() As String
        Get
            Return _studno
        End Get
        Set(value As String)
            _studno = value
        End Set
    End Property


    Public Property subcode() As String
        Get
            Return _subcode
        End Get
        Set(value As String)
            _subcode = value
        End Set
    End Property


    Public Property marks() As String
        Get
            Return _marks
        End Get
        Set(value As String)
            _marks = value
        End Set
    End Property





    Public Sub New()
        _studno = ""
        _subcode = ""
        _marks = 0
    End Sub

    Public Sub New(ByVal aStudno As String, ByVal aSubcode As String, ByVal aMarks As Integer)

        _studno = aStudno
        _subcode = aSubcode
        _marks = aMarks


    End Sub

    Public Overrides Function ToString() As String
        Return _studno & "\"
    End Function



End Class
