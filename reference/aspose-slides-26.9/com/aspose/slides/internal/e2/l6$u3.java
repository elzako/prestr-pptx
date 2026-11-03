package com.aspose.slides.internal.e2;

public class l6$u3 {
   public short n5;
   public short l6;
   public boolean k5;
   public boolean u3;

   public l6$u3() {
      this.n5 = 0;
      this.l6 = 0;
      this.k5 = false;
      this.u3 = false;
   }

   public l6$u3(l6$u3 var1) {
      this.n5 = var1.n5;
      this.l6 = var1.l6;
      this.k5 = var1.k5;
      this.u3 = var1.u3;
   }

   @Override
   public boolean equals(Object o) {
      return this.n5 == ((l6$u3)o).n5 && this.l6 == ((l6$u3)o).l6 && this.k5 == ((l6$u3)o).k5 && this.u3 == ((l6$u3)o).u3;
   }

   public boolean n5() {
      return !this.u3 && !this.k5 && this.n5 == 0 && this.l6 == 0;
   }

   public boolean n5(l6$a6 var1, l6$u3 var2) {
      if (var1 == l6$a6.n5) {
         return !this.u3 && !this.k5 && this.n5 == 0 && this.l6 == 0;
      } else if (var1 == l6$a6.l6) {
         return this.l6 == 0;
      } else if (var1 == l6$a6.k5) {
         return !this.u3 && !this.k5 && this.l6 == 0;
      } else {
         return var1 != l6$a6.u3 ? false : !this.u3 && !this.k5 && this.l6 == 0 && this.n5 == var2.n5;
      }
   }

   public n5 l6() {
      n5 var1 = null;
      if (this.u3) {
         this.u3 = false;
         var1 = new n5(107, this);
         var1.n5("'");
      } else if (this.k5) {
         this.k5 = false;
         var1 = new n5(108, this);
         var1.n5("\"");
      } else if (this.l6 != 0) {
         this.l6--;
         var1 = new n5(62, this);
         var1.n5(")");
      } else if (this.n5 != 0) {
         this.n5--;
         var1 = new n5(42, this);
         var1.n5("}");
      }

      return var1;
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("[=")
         .append(this.n5)
         .append(", (=")
         .append(this.l6)
         .append(", '=")
         .append(this.u3 ? "1" : "0")
         .append(", \"=")
         .append(this.k5 ? "1" : "0")
         .append("]");
      return var1.toString();
   }
}
