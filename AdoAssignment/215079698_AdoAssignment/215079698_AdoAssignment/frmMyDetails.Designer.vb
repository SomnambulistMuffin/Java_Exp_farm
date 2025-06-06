<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmMyDetails
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
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.btnUpdate = New System.Windows.Forms.Button()
        Me.txtAddUser = New System.Windows.Forms.TextBox()
        Me.txtAddPass = New System.Windows.Forms.TextBox()
        Me.txtAddName = New System.Windows.Forms.TextBox()
        Me.SuspendLayout()
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(63, 28)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(58, 13)
        Me.Label1.TabIndex = 0
        Me.Label1.Text = "Username:"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(63, 69)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(56, 13)
        Me.Label2.TabIndex = 1
        Me.Label2.Text = "Password:"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(74, 130)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(57, 13)
        Me.Label3.TabIndex = 2
        Me.Label3.Text = "Full Name:"
        '
        'btnUpdate
        '
        Me.btnUpdate.Location = New System.Drawing.Point(207, 228)
        Me.btnUpdate.Name = "btnUpdate"
        Me.btnUpdate.Size = New System.Drawing.Size(75, 23)
        Me.btnUpdate.TabIndex = 3
        Me.btnUpdate.Text = "Update"
        Me.btnUpdate.UseVisualStyleBackColor = True
        '
        'txtAddUser
        '
        Me.txtAddUser.Location = New System.Drawing.Point(179, 28)
        Me.txtAddUser.Name = "txtAddUser"
        Me.txtAddUser.Size = New System.Drawing.Size(100, 20)
        Me.txtAddUser.TabIndex = 4
        '
        'txtAddPass
        '
        Me.txtAddPass.Location = New System.Drawing.Point(191, 64)
        Me.txtAddPass.Name = "txtAddPass"
        Me.txtAddPass.Size = New System.Drawing.Size(100, 20)
        Me.txtAddPass.TabIndex = 5
        '
        'txtAddName
        '
        Me.txtAddName.Location = New System.Drawing.Point(191, 119)
        Me.txtAddName.Name = "txtAddName"
        Me.txtAddName.Size = New System.Drawing.Size(100, 20)
        Me.txtAddName.TabIndex = 6
        '
        'frmMyDetails
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(507, 327)
        Me.Controls.Add(Me.txtAddName)
        Me.Controls.Add(Me.txtAddPass)
        Me.Controls.Add(Me.txtAddUser)
        Me.Controls.Add(Me.btnUpdate)
        Me.Controls.Add(Me.Label3)
        Me.Controls.Add(Me.Label2)
        Me.Controls.Add(Me.Label1)
        Me.Name = "frmMyDetails"
        Me.Text = "frmMyDetails"
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents btnUpdate As System.Windows.Forms.Button
    Friend WithEvents txtAddUser As System.Windows.Forms.TextBox
    Friend WithEvents txtAddPass As System.Windows.Forms.TextBox
    Friend WithEvents txtAddName As System.Windows.Forms.TextBox
End Class
