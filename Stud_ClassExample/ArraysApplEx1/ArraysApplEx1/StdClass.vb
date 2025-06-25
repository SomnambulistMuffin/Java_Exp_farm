Public Class StdClass
    'Instance variable
    Private _stdNo As String
    Private _subjcode As String
    Private _marks As Integer
    'methods members
    Public Property stdNo() As String
        Get
            Return _stdNo
        End Get
        Set(value As String)
            _stdNo = value
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

    Public Property marks As String
        Get
            Return _marks

        End Get
        Set(value As String)
            _marks = value
        End Set
    End Property
End Class
