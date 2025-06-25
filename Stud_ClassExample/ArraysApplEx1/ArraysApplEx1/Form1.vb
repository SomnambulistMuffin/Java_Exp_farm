Public Class Form1



    Private Sub SaveSMToArrayToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles SaveSMToArrayToolStripMenuItem.Click
        Dim frm As New Save
        frm.MdiParent = Me
        frm.Show()

    End Sub

    Private Sub DisplayOriginalSMToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles DisplayOriginalSMToolStripMenuItem.Click
        Dim frm As New Display
        frm.MdiParent = Me
        frm.Text = "Display Original"
        frm.gbOriginal.Visible = True
        frm.gbSorted.Visible = False
        frm.btnDisp.Enabled = True

        frm.Show()
    End Sub

    Private Sub ExitToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles ExitToolStripMenuItem.Click
        If MessageBox.Show("Do u want to exit?", "Confirm", MessageBoxButtons.YesNo) Then
            Me.Close()

        End If

    End Sub

    Private Sub DisplaySortedToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles DisplaySortedToolStripMenuItem.Click
        Dim frm As New Display
        frm.MdiParent = Me
        frm.Text = "Display Sorted Array"
        frm.gbOriginal.Visible = False
        frm.gbSorted.Visible = True
        frm.Show()
    End Sub

    Private Sub CalcAVGToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles CalcAVGToolStripMenuItem.Click
       
    End Sub

    Private Sub HSMToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles HSMToolStripMenuItem.Click


    End Sub

  

    Private Sub FileToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles FileToolStripMenuItem.Click

    End Sub

    Private Sub CountToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles CountToolStripMenuItem.Click
       
    End Sub

    Private Sub SearchToolStripMenuItem_Click(sender As Object, e As EventArgs) Handles SearchToolStripMenuItem.Click
       
    End Sub
End Class
