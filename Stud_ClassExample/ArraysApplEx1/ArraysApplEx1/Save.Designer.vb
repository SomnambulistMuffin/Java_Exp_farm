<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Save
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
        Me.bntLoad = New System.Windows.Forms.Button()
        Me.lblDisp = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.txtSNo = New System.Windows.Forms.TextBox()
        Me.txtSCode = New System.Windows.Forms.TextBox()
        Me.txtMarks = New System.Windows.Forms.TextBox()
        Me.btnClear = New System.Windows.Forms.Button()
        Me.SuspendLayout()
        '
        'bntLoad
        '
        Me.bntLoad.Location = New System.Drawing.Point(9, 94)
        Me.bntLoad.Name = "bntLoad"
        Me.bntLoad.Size = New System.Drawing.Size(75, 23)
        Me.bntLoad.TabIndex = 1
        Me.bntLoad.Text = "Process"
        Me.bntLoad.UseVisualStyleBackColor = True
        '
        'lblDisp
        '
        Me.lblDisp.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.lblDisp.Location = New System.Drawing.Point(9, 133)
        Me.lblDisp.Name = "lblDisp"
        Me.lblDisp.Size = New System.Drawing.Size(193, 113)
        Me.lblDisp.TabIndex = 3
        Me.lblDisp.Text = "Label1"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(9, 13)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(46, 13)
        Me.Label2.TabIndex = 4
        Me.Label2.Text = "StudNo:"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(9, 48)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(50, 13)
        Me.Label3.TabIndex = 5
        Me.Label3.Text = "SujCode:"
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(9, 75)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(39, 13)
        Me.Label4.TabIndex = 6
        Me.Label4.Text = "Marks:"
        '
        'txtSNo
        '
        Me.txtSNo.Location = New System.Drawing.Point(78, 6)
        Me.txtSNo.Name = "txtSNo"
        Me.txtSNo.Size = New System.Drawing.Size(100, 20)
        Me.txtSNo.TabIndex = 7
        '
        'txtSCode
        '
        Me.txtSCode.Location = New System.Drawing.Point(78, 41)
        Me.txtSCode.Name = "txtSCode"
        Me.txtSCode.Size = New System.Drawing.Size(100, 20)
        Me.txtSCode.TabIndex = 8
        '
        'txtMarks
        '
        Me.txtMarks.Location = New System.Drawing.Point(78, 68)
        Me.txtMarks.Name = "txtMarks"
        Me.txtMarks.Size = New System.Drawing.Size(100, 20)
        Me.txtMarks.TabIndex = 9
        '
        'btnClear
        '
        Me.btnClear.Location = New System.Drawing.Point(103, 94)
        Me.btnClear.Name = "btnClear"
        Me.btnClear.Size = New System.Drawing.Size(75, 23)
        Me.btnClear.TabIndex = 10
        Me.btnClear.Text = "Clear"
        Me.btnClear.UseVisualStyleBackColor = True
        '
        'Save
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(214, 255)
        Me.Controls.Add(Me.btnClear)
        Me.Controls.Add(Me.txtMarks)
        Me.Controls.Add(Me.txtSCode)
        Me.Controls.Add(Me.txtSNo)
        Me.Controls.Add(Me.Label4)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.lblDisp)
        Me.Controls.Add(Me.bntLoad)
        Me.Name = "Save"
        Me.Text = "Save"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents bntLoad As System.Windows.Forms.Button
    Friend WithEvents lblDisp As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents txtSNo As System.Windows.Forms.TextBox
    Friend WithEvents txtSCode As System.Windows.Forms.TextBox
    Friend WithEvents txtMarks As System.Windows.Forms.TextBox
    Friend WithEvents btnClear As System.Windows.Forms.Button
End Class
