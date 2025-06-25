Public Class Save
    'Private objstud As stud_Class

    Private Sub bntLoad_Click(sender As Object, e As EventArgs) Handles bntLoad.Click

        objstud = New St
        objstud.studno = txtSNo.Text
        objstud.subjcode = txtSCode.Text
        objstud.marks = CInt(txtMarks.Text)

        'calling paramiterized constructors

        objstud = New St(txtSNo)



        lblDisp.Text = objstud.ToString



    End Sub

    Private Sub btnClear_Click(sender As Object, e As EventArgs) Handles btnClear.Click
        txtMarks.Clear()
        txtSCode.Clear()
        txtSNo.Clear()
        txtSNo.Focus()

    End Sub
End Class