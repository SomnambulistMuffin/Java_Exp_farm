Public Class stud_Class

    Private _studno, _subjCode As String
    Private __marks As Integer

    Public Property studNo() As String

        Get
            Return _studno
        End Get
        Set(value As String)
            _studno = value
        End Set
    End Property

    Public Property subjCode As String
        Get
            Return _subjCode

        End Get
        Set(value As String)
            _subjCode = value

        End Set
    End Property
    Public Property Marks As String
        Get
            Return _marks

        End Get
        Set(value As String)
            _marks = value

        End Set
    End Property

    Public Sub New()
        _studno = ""
        _subjCode = ""
        _marks = 0
    End Sub
    Public Sub New(ByVal studno As String, ByVal subjCode As String, ByVal marks As Integer)

        _studno = studNo
        _subjCode = subjCode
        _marks = marks

    End Sub
End Class
