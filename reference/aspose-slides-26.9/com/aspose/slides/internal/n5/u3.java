package com.aspose.slides.internal.n5;

public abstract class u3 {
   protected r4 n5;

   public u3() {
      this.n5 = new r4();
   }

   public u3(r4 var1) {
      if (var1 == null) {
         var1 = new r4();
      }

      this.n5 = var1;
   }

   public void n5() {
      if (this.n5 != null) {
         this.n5.l6 = -1;
         this.n5.k5 = false;
         this.n5.u3 = -1;
         this.n5.a6 = false;
         this.n5.u9 = 0;
         this.n5.h0 = 0;

         for (int var1 = 0; this.n5.c8 != null && var1 < this.n5.c8.length; var1++) {
            this.n5.c8[var1] = null;
         }
      }
   }

   public Object n5(e2 var1, int var2, a6 var3) throws w1 {
      Object var4 = this.n5(var1);
      if (var1.n5(1) == var2) {
         var1.n5();
         this.n5.k5 = false;
         this.n5.a6 = false;
         return var4;
      } else if (this.n5.h0 > 0) {
         this.n5.a6 = true;
         return var4;
      } else {
         return this.l6(var1, var2, var3);
      }
   }

   public boolean n5(e2 var1, int var2) {
      return var1.n5(2) == var2;
   }

   public boolean n5(e2 var1, a6 var2) {
      if (var2 == null) {
         return false;
      }

      if (var2.u3(1)) {
         a6 var3 = this.a6();
         var2 = var2.n5(var3);
         if (this.n5.l6 >= 0) {
            var2.a6(1);
         }
      }

      return var2.u3(var1.n5(1)) || var2.u3(1);
   }

   public void n5(w1 var1) {
      if (!this.n5.k5) {
         this.n5.u9++;
         this.n5.k5 = true;
         this.n5(this.u9(), var1);
      }
   }

   public void n5(String[] var1, w1 var2) {
      String var3 = this.l6(var2);
      String var4 = this.n5(var2, var1);
      this.n5(var3 + " " + var4);
   }

   public String n5(w1 var1, String[] var2) {
      String var3 = var1.getMessage();
      if (var1 instanceof d2) {
         d2 var4 = (d2)var1;
         String var5 = "<unknown>";
         if (var4.n5 == -1) {
            var5 = "EOF";
         } else {
            var5 = var2[var4.n5];
         }

         var3 = "extraneous input " + this.n5(var4.n5()) + " expecting " + var5;
      } else if (var1 instanceof k7) {
         k7 var6 = (k7)var1;
         String var13 = "<unknown>";
         if (var6.n5 == -1) {
            var13 = "EOF";
         } else {
            var13 = var2[var6.n5];
         }

         var3 = "missing " + var13 + " at " + this.n5(var1.u9);
      } else if (var1 instanceof z3) {
         z3 var7 = (z3)var1;
         String var15 = "<unknown>";
         if (var7.n5 == -1) {
            var15 = "EOF";
         } else {
            var15 = var2[var7.n5];
         }

         var3 = "mismatched input " + this.n5(var1.u9) + " expecting " + var15;
      } else if (var1 instanceof m1) {
         m1 var8 = (m1)var1;
         String var17 = "<unknown>";
         if (var8.n5 == -1) {
            var17 = "EOF";
         } else {
            var17 = var2[var8.n5];
         }

         var3 = "mismatched tree node: " + var8.h0 + " expecting " + var17;
      } else if (var1 instanceof m3) {
         var3 = "no viable alternative at input " + this.n5(var1.u9);
      } else if (var1 instanceof n3) {
         var3 = "required (...)+ loop did not match anything at input " + this.n5(var1.u9);
      } else if (var1 instanceof q0) {
         q0 var9 = (q0)var1;
         var3 = "mismatched input " + this.n5(var1.u9) + " expecting set " + var9.n5;
      } else if (var1 instanceof z1) {
         z1 var10 = (z1)var1;
         var3 = "mismatched input " + this.n5(var1.u9) + " expecting set " + var10.n5;
      } else if (var1 instanceof y4) {
         y4 var11 = (y4)var1;
         var3 = "rule " + var11.n5 + " failed predicate: {" + var11.l6 + "}?";
      }

      return var3;
   }

   public String l6(w1 var1) {
      return "line " + var1.t2 + ":" + var1.s7;
   }

   public String n5(y2 var1) {
      String var2 = var1.l6();
      if (var2 == null) {
         if (var1.n5() == -1) {
            var2 = "<EOF>";
         } else {
            var2 = "<" + var1.n5() + ">";
         }
      }

      var2 = var2.replaceAll("\n", "\\\\n");
      var2 = var2.replaceAll("\r", "\\\\r");
      var2 = var2.replaceAll("\t", "\\\\t");
      return "'" + var2 + "'";
   }

   public void n5(String var1) {
      System.err.println(var1);
   }

   public void n5(e2 var1, w1 var2) {
      if (this.n5.u3 == var1.l6()) {
         var1.n5();
      }

      this.n5.u3 = var1.l6();
      a6 var3 = this.u3();
      this.l6();
      this.l6(var1, var3);
      this.k5();
   }

   public void l6() {
   }

   public void k5() {
   }

   protected a6 u3() {
      return this.n5(false);
   }

   protected a6 a6() {
      return this.n5(true);
   }

   protected a6 n5(boolean var1) {
      int var2 = this.n5.l6;
      a6 var3 = new a6();

      for (int var4 = var2; var4 >= 0; var4--) {
         a6 var5 = this.n5.n5[var4];
         var3.l6(var5);
         if (var1) {
            if (!var5.u3(1)) {
               break;
            }

            if (var4 > 0) {
               var3.a6(1);
            }
         }
      }

      return var3;
   }

   protected Object l6(e2 var1, int var2, a6 var3) throws w1 {
      z3 var4 = null;
      if (this.n5(var1, var2)) {
         var4 = new d2(var2, var1);
         this.l6();
         var1.n5();
         this.k5();
         this.n5(var4);
         Object var9 = this.n5(var1);
         var1.n5();
         return var9;
      } else if (this.n5(var1, var3)) {
         Object var5 = this.n5(var1, var4, var2, var3);
         var4 = new k7(var2, var1, var5);
         this.n5(var4);
         return var5;
      } else {
         var4 = new z3(var2, var1);
         throw var4;
      }
   }

   protected Object n5(e2 var1) {
      return null;
   }

   protected Object n5(e2 var1, w1 var2, int var3, a6 var4) {
      return null;
   }

   public void l6(e2 var1, a6 var2) {
      for (int var3 = var1.n5(1); var3 != -1 && !var2.u3(var3); var3 = var1.n5(1)) {
         var1.n5();
      }
   }

   protected void n5(a6 var1) {
      if (this.n5.l6 + 1 >= this.n5.n5.length) {
         a6[] var2 = new a6[this.n5.n5.length * 2];
         System.arraycopy(this.n5.n5, 0, var2, 0, this.n5.n5.length);
         this.n5.n5 = var2;
      }

      this.n5.n5[++this.n5.l6] = var1;
   }

   public String[] u9() {
      return null;
   }
}
