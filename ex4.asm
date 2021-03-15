.data
i: .word 7
j: .word 1  #ASSIGN: <var_name> : .word  <assigned_value>
m: .word 0
n: .word 3

.text
#Laboratory Exercise 3, Home Assignment 1
la 	$t8,i	#load address
la 	$t9,j
la	$k0,m
la	$k1,n
lw 	$s1,0($t8)
lw 	$s2,0($t9)
lw	$s3,0($k0)
lw	$s4,0($k1) 
start:	
	add 	$s0,$s1,$s2	# i+j
	#addi	$t0,m,n --> CANNOT USE FOR VARIABLE, ONLY FOR CONSTANT (IMMEDIATE) 
	add  	$s5,$s3,$s4	# m+n
	bgt	$s0,$s5,else	# branch if i+j GREATER THAN m + n
	addi	$t1,$t1,1	#then part: x = x+1
	addi	$t3,$zero,1	#z = 1
	j	endif		#skip "else" part

else:
	addi	$t2,$t2,-1	#begin else part: y = y - 1
	add	$t3,$t3,$t3	#z = z+z || z= 2*z	
endif:
