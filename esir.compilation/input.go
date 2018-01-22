package main
import (libWH "./libGO"
	"fmt"
	"os"
	"strconv"
)
var s0 *libWH.Tree
var s1 *libWH.Tree
var s2 *libWH.Tree

func main(){
s0=&(libWH.Tree{"nil",nil,nil})
s1=&(libWH.Tree{"toto",nil,nil})
s2=&(libWH.Tree{"totoh",nil,nil})

	nbOut := 2
	if (len(os.Args)-1)>=nbOut {
		i1, err1 := strconv.Atoi(os.Args[1])
		i2, err2 := strconv.Atoi(os.Args[2])

		if err1 == nil && err2 == nil {
			v0,v1,v2,v3,v4:=f6(libWH.NumberToTree(i1),libWH.NumberToTree(i2))
			fmt.Println(libWH.TreeToNumber(v0))
			fmt.Println(libWH.TreeToNumber(v1))
			fmt.Println(libWH.TreeToNumber(v2))
			fmt.Println(libWH.TreeToNumber(v3))
			fmt.Println(libWH.TreeToNumber(v4))
		}else{
			fmt.Println("L'un des arguments n'est pas un nombre")
		}
	}else{
		fmt.Println("Nombre d'arguments incorrect") 
	}
}

func f0(v0 *libWH.Tree) (*libWH.Tree) {

var v1 *libWH.Tree = &(libWH.Tree{"nil",nil,nil})
_ = v1

for libWH.IsTrue(v0){
   v0 = v1

}

return v0 
}

func f1(v0 *libWH.Tree) (*libWH.Tree) {




return v0 
}

func f2(v0 *libWH.Tree) (*libWH.Tree) {




return v0 
}

func f3(v0 *libWH.Tree) (*libWH.Tree) {




return v0 
}

func f4(v0 *libWH.Tree) (*libWH.Tree) {




return v0 
}

func f5(v0, v1 *libWH.Tree) (*libWH.Tree, *libWH.Tree, *libWH.Tree, *libWH.Tree) {

var v2 *libWH.Tree = &(libWH.Tree{"nil",nil,nil})
_ = v2
var v3 *libWH.Tree = &(libWH.Tree{"nil",nil,nil})
_ = v3
var v4 *libWH.Tree = &(libWH.Tree{"nil",nil,nil})
_ = v4
var vt0 *libWH.Tree = &(libWH.Tree{"nil",nil,nil})
_ = vt0
var vt1 *libWH.Tree = &(libWH.Tree{"nil",nil,nil})
_ = vt1
var vt2 *libWH.Tree = &(libWH.Tree{"nil",nil,nil})
_ = vt2
var vt3 *libWH.Tree = &(libWH.Tree{"nil",nil,nil})
_ = vt3

vt0 = libWH.Op_eg(s1,s1)

v2 = vt0

vt1 = libWH.Op_eg(s2,s1)

v3 = vt1

vt2 = libWH.Op_eg(v0,v1)

v4 = vt2

vt3 = libWH.Op_eg(v2,v1)

v0 = vt3


return v2,v3,v4,v0 
}

func f6(v0, v1 *libWH.Tree) (*libWH.Tree, *libWH.Tree, *libWH.Tree, *libWH.Tree, *libWH.Tree) {

var v2 *libWH.Tree = &(libWH.Tree{"nil",nil,nil})
_ = v2
var v3 *libWH.Tree = &(libWH.Tree{"nil",nil,nil})
_ = v3
var v4 *libWH.Tree = &(libWH.Tree{"nil",nil,nil})
_ = v4
var v5 *libWH.Tree = &(libWH.Tree{"nil",nil,nil})
_ = v5
var v6 *libWH.Tree = &(libWH.Tree{"nil",nil,nil})
_ = v6
var v7 *libWH.Tree = &(libWH.Tree{"nil",nil,nil})
_ = v7
var vt0 *libWH.Tree = &(libWH.Tree{"nil",nil,nil})
_ = vt0
var vt1 *libWH.Tree = &(libWH.Tree{"nil",nil,nil})
_ = vt1
var vt2 *libWH.Tree = &(libWH.Tree{"nil",nil,nil})
_ = vt2
var vt3 *libWH.Tree = &(libWH.Tree{"nil",nil,nil})
_ = vt3
var vt4 *libWH.Tree = &(libWH.Tree{"nil",nil,nil})
_ = vt4
var vt5 *libWH.Tree = &(libWH.Tree{"nil",nil,nil})
_ = vt5

vt1 = libWH.Op_and(v0,v1)
vt0 = libWH.Op_or(vt1,v2)

v2 = vt0

vt2 = libWH.Op_or(v2,v1)

v3 = vt2

vt3 = libWH.Op_or(v4,v2)

v5 = vt3

vt4 = libWH.Op_and(v4,v2)

v0 = vt4

vt5 = libWH.Op_and(v6,v7)

v1 = vt5


return v0,v1,v2,v3,v5 
}
