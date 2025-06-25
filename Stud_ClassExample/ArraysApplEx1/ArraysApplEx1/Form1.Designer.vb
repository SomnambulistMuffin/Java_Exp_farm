<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.MenuStrip1 = New System.Windows.Forms.MenuStrip()
        Me.FileToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.SaveSMToArrayToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.DisplayOriginalSMToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.DisplaySortedToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.HSMToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.CalcAVGToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.CountToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.SearchToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.ExitToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem()
        Me.MenuStrip1.SuspendLayout()
        Me.SuspendLayout()
        '
        'MenuStrip1
        '
        Me.MenuStrip1.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.FileToolStripMenuItem, Me.ExitToolStripMenuItem})
        Me.MenuStrip1.Location = New System.Drawing.Point(0, 0)
        Me.MenuStrip1.Name = "MenuStrip1"
        Me.MenuStrip1.Size = New System.Drawing.Size(351, 24)
        Me.MenuStrip1.TabIndex = 9
        Me.MenuStrip1.Text = "MenuStrip1"
        '
        'FileToolStripMenuItem
        '
        Me.FileToolStripMenuItem.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.SaveSMToArrayToolStripMenuItem, Me.DisplayOriginalSMToolStripMenuItem, Me.DisplaySortedToolStripMenuItem, Me.HSMToolStripMenuItem, Me.CalcAVGToolStripMenuItem, Me.CountToolStripMenuItem, Me.SearchToolStripMenuItem})
        Me.FileToolStripMenuItem.Name = "FileToolStripMenuItem"
        Me.FileToolStripMenuItem.Size = New System.Drawing.Size(37, 20)
        Me.FileToolStripMenuItem.Text = "File"
        '
        'SaveSMToArrayToolStripMenuItem
        '
        Me.SaveSMToArrayToolStripMenuItem.Name = "SaveSMToArrayToolStripMenuItem"
        Me.SaveSMToArrayToolStripMenuItem.Size = New System.Drawing.Size(224, 22)
        Me.SaveSMToArrayToolStripMenuItem.Text = "Add Stud to  Array"
        '
        'DisplayOriginalSMToolStripMenuItem
        '
        Me.DisplayOriginalSMToolStripMenuItem.Name = "DisplayOriginalSMToolStripMenuItem"
        Me.DisplayOriginalSMToolStripMenuItem.Size = New System.Drawing.Size(224, 22)
        Me.DisplayOriginalSMToolStripMenuItem.Text = "Display Original Stud Record"
        '
        'DisplaySortedToolStripMenuItem
        '
        Me.DisplaySortedToolStripMenuItem.Name = "DisplaySortedToolStripMenuItem"
        Me.DisplaySortedToolStripMenuItem.Size = New System.Drawing.Size(224, 22)
        Me.DisplaySortedToolStripMenuItem.Text = "Display Sorted Stud Record"
        '
        'HSMToolStripMenuItem
        '
        Me.HSMToolStripMenuItem.Name = "HSMToolStripMenuItem"
        Me.HSMToolStripMenuItem.Size = New System.Drawing.Size(224, 22)
        Me.HSMToolStripMenuItem.Text = "Stud with HSM"
        '
        'CalcAVGToolStripMenuItem
        '
        Me.CalcAVGToolStripMenuItem.Name = "CalcAVGToolStripMenuItem"
        Me.CalcAVGToolStripMenuItem.Size = New System.Drawing.Size(224, 22)
        Me.CalcAVGToolStripMenuItem.Text = "Calc All Marks AVG"
        '
        'CountToolStripMenuItem
        '
        Me.CountToolStripMenuItem.Name = "CountToolStripMenuItem"
        Me.CountToolStripMenuItem.Size = New System.Drawing.Size(224, 22)
        Me.CountToolStripMenuItem.Text = "Count Stud for Specific Subj"
        '
        'SearchToolStripMenuItem
        '
        Me.SearchToolStripMenuItem.Name = "SearchToolStripMenuItem"
        Me.SearchToolStripMenuItem.Size = New System.Drawing.Size(224, 22)
        Me.SearchToolStripMenuItem.Text = "Search StudNo"
        '
        'ExitToolStripMenuItem
        '
        Me.ExitToolStripMenuItem.Name = "ExitToolStripMenuItem"
        Me.ExitToolStripMenuItem.Size = New System.Drawing.Size(37, 20)
        Me.ExitToolStripMenuItem.Text = "Exit"
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(351, 196)
        Me.Controls.Add(Me.MenuStrip1)
        Me.IsMdiContainer = True
        Me.MainMenuStrip = Me.MenuStrip1
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.MenuStrip1.ResumeLayout(False)
        Me.MenuStrip1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents MenuStrip1 As System.Windows.Forms.MenuStrip
    Friend WithEvents FileToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents SaveSMToArrayToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents DisplayOriginalSMToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents DisplaySortedToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents HSMToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents CalcAVGToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents ExitToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents CountToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents SearchToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem

End Class
