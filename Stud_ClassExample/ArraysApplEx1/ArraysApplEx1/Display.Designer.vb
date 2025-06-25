<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Display
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
        Me.gbSorted = New System.Windows.Forms.GroupBox()
        Me.lstSort = New System.Windows.Forms.ListBox()
        Me.btnSort = New System.Windows.Forms.Button()
        Me.gbOriginal = New System.Windows.Forms.GroupBox()
        Me.lstDisp = New System.Windows.Forms.ListBox()
        Me.btnDisp = New System.Windows.Forms.Button()
        Me.gbSorted.SuspendLayout()
        Me.gbOriginal.SuspendLayout()
        Me.SuspendLayout()
        '
        'gbSorted
        '
        Me.gbSorted.Controls.Add(Me.lstSort)
        Me.gbSorted.Controls.Add(Me.btnSort)
        Me.gbSorted.Location = New System.Drawing.Point(185, 12)
        Me.gbSorted.Name = "gbSorted"
        Me.gbSorted.Size = New System.Drawing.Size(201, 204)
        Me.gbSorted.TabIndex = 5
        Me.gbSorted.TabStop = False
        Me.gbSorted.Text = "Display Sorted "
        '
        'lstSort
        '
        Me.lstSort.FormattingEnabled = True
        Me.lstSort.Location = New System.Drawing.Point(7, 22)
        Me.lstSort.Name = "lstSort"
        Me.lstSort.Size = New System.Drawing.Size(188, 134)
        Me.lstSort.TabIndex = 7
        '
        'btnSort
        '
        Me.btnSort.Location = New System.Drawing.Point(6, 159)
        Me.btnSort.Name = "btnSort"
        Me.btnSort.Size = New System.Drawing.Size(93, 39)
        Me.btnSort.TabIndex = 6
        Me.btnSort.Text = "Sort Data"
        Me.btnSort.UseVisualStyleBackColor = True
        '
        'gbOriginal
        '
        Me.gbOriginal.Controls.Add(Me.lstDisp)
        Me.gbOriginal.Controls.Add(Me.btnDisp)
        Me.gbOriginal.Location = New System.Drawing.Point(12, 12)
        Me.gbOriginal.Name = "gbOriginal"
        Me.gbOriginal.Size = New System.Drawing.Size(173, 204)
        Me.gbOriginal.TabIndex = 4
        Me.gbOriginal.TabStop = False
        Me.gbOriginal.Text = "Original Display"
        '
        'lstDisp
        '
        Me.lstDisp.FormattingEnabled = True
        Me.lstDisp.Location = New System.Drawing.Point(9, 22)
        Me.lstDisp.Name = "lstDisp"
        Me.lstDisp.Size = New System.Drawing.Size(158, 134)
        Me.lstDisp.TabIndex = 6
        '
        'btnDisp
        '
        Me.btnDisp.Location = New System.Drawing.Point(6, 159)
        Me.btnDisp.Name = "btnDisp"
        Me.btnDisp.Size = New System.Drawing.Size(64, 39)
        Me.btnDisp.TabIndex = 2
        Me.btnDisp.Text = "Display"
        Me.btnDisp.UseVisualStyleBackColor = True
        '
        'Display
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(393, 238)
        Me.Controls.Add(Me.gbSorted)
        Me.Controls.Add(Me.gbOriginal)
        Me.Name = "Display"
        Me.Text = "Display"
        Me.gbSorted.ResumeLayout(False)
        Me.gbOriginal.ResumeLayout(False)
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents gbSorted As System.Windows.Forms.GroupBox
    Friend WithEvents gbOriginal As System.Windows.Forms.GroupBox
    Friend WithEvents btnDisp As System.Windows.Forms.Button
    Friend WithEvents btnSort As System.Windows.Forms.Button
    Friend WithEvents lstDisp As System.Windows.Forms.ListBox
    Friend WithEvents lstSort As System.Windows.Forms.ListBox
End Class
