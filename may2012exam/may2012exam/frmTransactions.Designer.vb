<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmTransactions
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
        Me.gbAccDeets = New System.Windows.Forms.GroupBox()
        Me.gbAccHolder = New System.Windows.Forms.GroupBox()
        Me.Label3 = New System.Windows.Forms.Label()
        Me.Label2 = New System.Windows.Forms.Label()
        Me.TextBox5 = New System.Windows.Forms.TextBox()
        Me.TextBox1 = New System.Windows.Forms.TextBox()
        Me.GroupBox3 = New System.Windows.Forms.GroupBox()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.gbAcctype = New System.Windows.Forms.GroupBox()
        Me.rdCheque = New System.Windows.Forms.RadioButton()
        Me.rdSavings = New System.Windows.Forms.RadioButton()
        Me.cmbAccountNo = New System.Windows.Forms.ComboBox()
        Me.gbTransactions = New System.Windows.Forms.GroupBox()
        Me.gbTransType = New System.Windows.Forms.GroupBox()
        Me.gbAmount = New System.Windows.Forms.GroupBox()
        Me.TextBox4 = New System.Windows.Forms.TextBox()
        Me.Label6 = New System.Windows.Forms.Label()
        Me.gbDeposit = New System.Windows.Forms.GroupBox()
        Me.Label5 = New System.Windows.Forms.Label()
        Me.TextBox3 = New System.Windows.Forms.TextBox()
        Me.gbNewAcc = New System.Windows.Forms.GroupBox()
        Me.TextBox2 = New System.Windows.Forms.TextBox()
        Me.Label4 = New System.Windows.Forms.Label()
        Me.btnSubmit = New System.Windows.Forms.Button()
        Me.GroupBox6 = New System.Windows.Forms.GroupBox()
        Me.lsbDisplay = New System.Windows.Forms.ListBox()
        Me.btnClose = New System.Windows.Forms.Button()
        Me.btnSummary = New System.Windows.Forms.Button()
        Me.gbAccDeets.SuspendLayout()
        Me.gbAccHolder.SuspendLayout()
        Me.GroupBox3.SuspendLayout()
        Me.gbAcctype.SuspendLayout()
        Me.gbTransactions.SuspendLayout()
        Me.gbTransType.SuspendLayout()
        Me.gbAmount.SuspendLayout()
        Me.gbDeposit.SuspendLayout()
        Me.gbNewAcc.SuspendLayout()
        Me.GroupBox6.SuspendLayout()
        Me.SuspendLayout()
        '
        'gbAccDeets
        '
        Me.gbAccDeets.Controls.Add(Me.gbAccHolder)
        Me.gbAccDeets.Controls.Add(Me.GroupBox3)
        Me.gbAccDeets.Location = New System.Drawing.Point(24, 15)
        Me.gbAccDeets.Name = "gbAccDeets"
        Me.gbAccDeets.Size = New System.Drawing.Size(682, 149)
        Me.gbAccDeets.TabIndex = 0
        Me.gbAccDeets.TabStop = False
        Me.gbAccDeets.Text = "Account details"
        '
        'gbAccHolder
        '
        Me.gbAccHolder.Controls.Add(Me.Label3)
        Me.gbAccHolder.Controls.Add(Me.Label2)
        Me.gbAccHolder.Controls.Add(Me.TextBox5)
        Me.gbAccHolder.Controls.Add(Me.TextBox1)
        Me.gbAccHolder.Location = New System.Drawing.Point(348, 25)
        Me.gbAccHolder.Name = "gbAccHolder"
        Me.gbAccHolder.Size = New System.Drawing.Size(284, 102)
        Me.gbAccHolder.TabIndex = 1
        Me.gbAccHolder.TabStop = False
        Me.gbAccHolder.Text = "Account holder"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(39, 71)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(64, 13)
        Me.Label3.TabIndex = 3
        Me.Label3.Text = "Contact No:"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(39, 33)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(38, 13)
        Me.Label2.TabIndex = 2
        Me.Label2.Text = "Name:"
        '
        'TextBox5
        '
        Me.TextBox5.Location = New System.Drawing.Point(103, 63)
        Me.TextBox5.Name = "TextBox5"
        Me.TextBox5.Size = New System.Drawing.Size(100, 20)
        Me.TextBox5.TabIndex = 1
        '
        'TextBox1
        '
        Me.TextBox1.Location = New System.Drawing.Point(103, 32)
        Me.TextBox1.Name = "TextBox1"
        Me.TextBox1.Size = New System.Drawing.Size(100, 20)
        Me.TextBox1.TabIndex = 0
        '
        'GroupBox3
        '
        Me.GroupBox3.Controls.Add(Me.Label1)
        Me.GroupBox3.Controls.Add(Me.gbAcctype)
        Me.GroupBox3.Controls.Add(Me.cmbAccountNo)
        Me.GroupBox3.Location = New System.Drawing.Point(32, 23)
        Me.GroupBox3.Name = "GroupBox3"
        Me.GroupBox3.Size = New System.Drawing.Size(282, 120)
        Me.GroupBox3.TabIndex = 0
        Me.GroupBox3.TabStop = False
        Me.GroupBox3.Text = "GroupBox3"
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(36, 40)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(67, 13)
        Me.Label1.TabIndex = 2
        Me.Label1.Text = "Account No:"
        '
        'gbAcctype
        '
        Me.gbAcctype.Controls.Add(Me.rdCheque)
        Me.gbAcctype.Controls.Add(Me.rdSavings)
        Me.gbAcctype.Location = New System.Drawing.Point(6, 62)
        Me.gbAcctype.Name = "gbAcctype"
        Me.gbAcctype.Size = New System.Drawing.Size(261, 52)
        Me.gbAcctype.TabIndex = 1
        Me.gbAcctype.TabStop = False
        Me.gbAcctype.Text = "Account type"
        '
        'rdCheque
        '
        Me.rdCheque.AutoSize = True
        Me.rdCheque.Location = New System.Drawing.Point(167, 28)
        Me.rdCheque.Name = "rdCheque"
        Me.rdCheque.Size = New System.Drawing.Size(62, 17)
        Me.rdCheque.TabIndex = 1
        Me.rdCheque.TabStop = True
        Me.rdCheque.Text = "Cheque"
        Me.rdCheque.UseVisualStyleBackColor = True
        '
        'rdSavings
        '
        Me.rdSavings.AutoSize = True
        Me.rdSavings.Location = New System.Drawing.Point(46, 27)
        Me.rdSavings.Name = "rdSavings"
        Me.rdSavings.Size = New System.Drawing.Size(63, 17)
        Me.rdSavings.TabIndex = 0
        Me.rdSavings.TabStop = True
        Me.rdSavings.Text = "Savings"
        Me.rdSavings.UseVisualStyleBackColor = True
        '
        'cmbAccountNo
        '
        Me.cmbAccountNo.FormattingEnabled = True
        Me.cmbAccountNo.Location = New System.Drawing.Point(134, 33)
        Me.cmbAccountNo.Name = "cmbAccountNo"
        Me.cmbAccountNo.Size = New System.Drawing.Size(121, 21)
        Me.cmbAccountNo.TabIndex = 0
        '
        'gbTransactions
        '
        Me.gbTransactions.Controls.Add(Me.gbTransType)
        Me.gbTransactions.Location = New System.Drawing.Point(19, 170)
        Me.gbTransactions.Name = "gbTransactions"
        Me.gbTransactions.Size = New System.Drawing.Size(373, 294)
        Me.gbTransactions.TabIndex = 1
        Me.gbTransactions.TabStop = False
        Me.gbTransactions.Text = "Transactions"
        '
        'gbTransType
        '
        Me.gbTransType.Controls.Add(Me.gbAmount)
        Me.gbTransType.Controls.Add(Me.gbDeposit)
        Me.gbTransType.Controls.Add(Me.gbNewAcc)
        Me.gbTransType.Controls.Add(Me.btnSubmit)
        Me.gbTransType.Location = New System.Drawing.Point(21, 29)
        Me.gbTransType.Name = "gbTransType"
        Me.gbTransType.Size = New System.Drawing.Size(341, 251)
        Me.gbTransType.TabIndex = 0
        Me.gbTransType.TabStop = False
        Me.gbTransType.Text = "transaction type"
        '
        'gbAmount
        '
        Me.gbAmount.Controls.Add(Me.TextBox4)
        Me.gbAmount.Controls.Add(Me.Label6)
        Me.gbAmount.Location = New System.Drawing.Point(32, 143)
        Me.gbAmount.Name = "gbAmount"
        Me.gbAmount.Size = New System.Drawing.Size(240, 47)
        Me.gbAmount.TabIndex = 9
        Me.gbAmount.TabStop = False
        Me.gbAmount.Text = "Amount"
        '
        'TextBox4
        '
        Me.TextBox4.Location = New System.Drawing.Point(118, 15)
        Me.TextBox4.Name = "TextBox4"
        Me.TextBox4.Size = New System.Drawing.Size(100, 20)
        Me.TextBox4.TabIndex = 2
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(20, 22)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(101, 13)
        Me.Label6.TabIndex = 6
        Me.Label6.Text = "Withdrawal amount:"
        '
        'gbDeposit
        '
        Me.gbDeposit.Controls.Add(Me.Label5)
        Me.gbDeposit.Controls.Add(Me.TextBox3)
        Me.gbDeposit.Location = New System.Drawing.Point(32, 78)
        Me.gbDeposit.Name = "gbDeposit"
        Me.gbDeposit.Size = New System.Drawing.Size(247, 49)
        Me.gbDeposit.TabIndex = 8
        Me.gbDeposit.TabStop = False
        Me.gbDeposit.Text = "Deposit"
        '
        'Label5
        '
        Me.Label5.AutoSize = True
        Me.Label5.Location = New System.Drawing.Point(20, 33)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(81, 13)
        Me.Label5.TabIndex = 5
        Me.Label5.Text = "Deposit amount"
        '
        'TextBox3
        '
        Me.TextBox3.Location = New System.Drawing.Point(118, 19)
        Me.TextBox3.Name = "TextBox3"
        Me.TextBox3.Size = New System.Drawing.Size(104, 20)
        Me.TextBox3.TabIndex = 1
        '
        'gbNewAcc
        '
        Me.gbNewAcc.Controls.Add(Me.TextBox2)
        Me.gbNewAcc.Controls.Add(Me.Label4)
        Me.gbNewAcc.Location = New System.Drawing.Point(22, 19)
        Me.gbNewAcc.Name = "gbNewAcc"
        Me.gbNewAcc.Size = New System.Drawing.Size(261, 41)
        Me.gbNewAcc.TabIndex = 7
        Me.gbNewAcc.TabStop = False
        Me.gbNewAcc.Text = "New account"
        '
        'TextBox2
        '
        Me.TextBox2.Location = New System.Drawing.Point(132, 15)
        Me.TextBox2.Name = "TextBox2"
        Me.TextBox2.Size = New System.Drawing.Size(100, 20)
        Me.TextBox2.TabIndex = 0
        '
        'Label4
        '
        Me.Label4.AutoSize = True
        Me.Label4.Location = New System.Drawing.Point(30, 18)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(78, 13)
        Me.Label4.TabIndex = 4
        Me.Label4.Text = "Open Balance:"
        '
        'btnSubmit
        '
        Me.btnSubmit.Location = New System.Drawing.Point(134, 222)
        Me.btnSubmit.Name = "btnSubmit"
        Me.btnSubmit.Size = New System.Drawing.Size(75, 23)
        Me.btnSubmit.TabIndex = 3
        Me.btnSubmit.Text = "Submit"
        Me.btnSubmit.UseVisualStyleBackColor = True
        '
        'GroupBox6
        '
        Me.GroupBox6.Controls.Add(Me.lsbDisplay)
        Me.GroupBox6.Location = New System.Drawing.Point(414, 199)
        Me.GroupBox6.Name = "GroupBox6"
        Me.GroupBox6.Size = New System.Drawing.Size(292, 275)
        Me.GroupBox6.TabIndex = 1
        Me.GroupBox6.TabStop = False
        Me.GroupBox6.Text = "GroupBox6"
        '
        'lsbDisplay
        '
        Me.lsbDisplay.FormattingEnabled = True
        Me.lsbDisplay.Location = New System.Drawing.Point(25, 25)
        Me.lsbDisplay.Name = "lsbDisplay"
        Me.lsbDisplay.Size = New System.Drawing.Size(234, 225)
        Me.lsbDisplay.TabIndex = 0
        '
        'btnClose
        '
        Me.btnClose.Location = New System.Drawing.Point(510, 487)
        Me.btnClose.Name = "btnClose"
        Me.btnClose.Size = New System.Drawing.Size(75, 23)
        Me.btnClose.TabIndex = 1
        Me.btnClose.Text = "Close"
        Me.btnClose.UseVisualStyleBackColor = True
        '
        'btnSummary
        '
        Me.btnSummary.Location = New System.Drawing.Point(235, 487)
        Me.btnSummary.Name = "btnSummary"
        Me.btnSummary.Size = New System.Drawing.Size(135, 23)
        Me.btnSummary.TabIndex = 2
        Me.btnSummary.Text = "Month end Summary"
        Me.btnSummary.UseVisualStyleBackColor = True
        '
        'frmTransactions
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(729, 512)
        Me.Controls.Add(Me.btnClose)
        Me.Controls.Add(Me.GroupBox6)
        Me.Controls.Add(Me.btnSummary)
        Me.Controls.Add(Me.gbTransactions)
        Me.Controls.Add(Me.gbAccDeets)
        Me.Name = "frmTransactions"
        Me.Text = "frmTransactions"
        Me.gbAccDeets.ResumeLayout(False)
        Me.gbAccHolder.ResumeLayout(False)
        Me.gbAccHolder.PerformLayout()
        Me.GroupBox3.ResumeLayout(False)
        Me.GroupBox3.PerformLayout()
        Me.gbAcctype.ResumeLayout(False)
        Me.gbAcctype.PerformLayout()
        Me.gbTransactions.ResumeLayout(False)
        Me.gbTransType.ResumeLayout(False)
        Me.gbAmount.ResumeLayout(False)
        Me.gbAmount.PerformLayout()
        Me.gbDeposit.ResumeLayout(False)
        Me.gbDeposit.PerformLayout()
        Me.gbNewAcc.ResumeLayout(False)
        Me.gbNewAcc.PerformLayout()
        Me.GroupBox6.ResumeLayout(False)
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents gbAccDeets As System.Windows.Forms.GroupBox
    Friend WithEvents gbAccHolder As System.Windows.Forms.GroupBox
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents TextBox5 As System.Windows.Forms.TextBox
    Friend WithEvents TextBox1 As System.Windows.Forms.TextBox
    Friend WithEvents GroupBox3 As System.Windows.Forms.GroupBox
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents gbAcctype As System.Windows.Forms.GroupBox
    Friend WithEvents rdCheque As System.Windows.Forms.RadioButton
    Friend WithEvents rdSavings As System.Windows.Forms.RadioButton
    Friend WithEvents cmbAccountNo As System.Windows.Forms.ComboBox
    Friend WithEvents gbTransactions As System.Windows.Forms.GroupBox
    Friend WithEvents GroupBox6 As System.Windows.Forms.GroupBox
    Friend WithEvents btnClose As System.Windows.Forms.Button
    Friend WithEvents lsbDisplay As System.Windows.Forms.ListBox
    Friend WithEvents gbTransType As System.Windows.Forms.GroupBox
    Friend WithEvents gbAmount As System.Windows.Forms.GroupBox
    Friend WithEvents TextBox4 As System.Windows.Forms.TextBox
    Friend WithEvents Label6 As System.Windows.Forms.Label
    Friend WithEvents gbDeposit As System.Windows.Forms.GroupBox
    Friend WithEvents Label5 As System.Windows.Forms.Label
    Friend WithEvents TextBox3 As System.Windows.Forms.TextBox
    Friend WithEvents gbNewAcc As System.Windows.Forms.GroupBox
    Friend WithEvents TextBox2 As System.Windows.Forms.TextBox
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents btnSubmit As System.Windows.Forms.Button
    Friend WithEvents btnSummary As System.Windows.Forms.Button
End Class
