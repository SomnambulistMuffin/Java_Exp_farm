Public Class St
    'instance variables
    Private _studno, _subjcode As String
    Private _marks As Integer
    Private _textBox As TextBox

    Sub New(textBox As TextBox)
        ' TODO: Complete member initialization 
        _textBox = textBox
    End Sub

    'Method members
    'property methods for all instance variables
    Public Property studno() As String
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
    Public Property marks() As Integer
        Get
            Return _marks
        End Get
        Set(value As Integer)
            _marks = value
        End Set
    End Property

    Public Sub New()

        _studno = ""
        _subjcode = ""
        _marks = ""

    End Sub

    Public Sub New(ByVal studno As String, ByVal subjcode As String, ByVal marks As Integer)

        _studno = studno
        _subjcode = subjcode
        _marks = marks

    End Sub
End Class
