Public Class ClassStudent
    'Ins Variables
    Private _studno, _subjcode As String
    Private _marks As Integer
    'method  members
    'property method for all inst varia

    Public Property stno() As String
        Get
            Return _studno

        End Get
        Set(value As String)
            _studno = value
        End Set
    End Property
    Public Property subjcode() As String
        Get
            Return _subjcode

        End Get
        Set(value As String)
            _subjcode = value
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
        _subjcode = ""
        _marks = 0

    End Sub
    Public Sub New(ByVal astudno As String, ByVal assubjcode As String, ByVal amarks As Integer)
        _studno = astudno
        _subjcode = assubjcode
        _marks = amarks


    End Sub
    Public Overrides Function ToString() As String
        Return _studno & "  /  " & _subjcode & "  /  " & _marks

    End Function
End Class
