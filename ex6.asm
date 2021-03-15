.data   
A: .word  1,0,5,2,-3,-9
i: .word  0
n: .word  6
max_abs:  .word 
real_value:  .word

.text
la	$s1,A 		# $s1 --> A
lw	$s2,i		# $s2 --> i
lw	$s3,n		# $s3 --> n
lw	$s4,max_abs	# $s4 --> max_abs
lw	$s5,real_value

lw	$s5,0($s1)	# take A[0]
abs	$s4,$s5
add	$s4,$s4,$s6	# max_abs = $s4 = $s4 + $s6 = $s6 = A[0]

loop:
	mul 	$t1, $s2, 4	# 4*i
	add	$t1,$t1,$s1	# t1 store the address of A[i]  ---> $s1 is address, not a value
	lw	$t0,0($t1)	# load value of A[i] in $t0  ---> take value from $t1 ($t1 is address)
	add	$s5,$zero,$t0
	abs	$t5,$t0		# $t5 = |$t0|
	bgt	$t5,$s4,assign	
	addi	$s2,$s2,1
	blt	$s2,$s3,loop
	
assign:
	#lw	$s4,0($t5)	#ERROR HERE!!! (ASSIGN max_abs ($t4) = 
	add	$s5,$zero,$t0
	add 	$s4, $zero, $t5
	addi	$s2,$s2,1
	blt	$s2,$s3,loop
	
	
	