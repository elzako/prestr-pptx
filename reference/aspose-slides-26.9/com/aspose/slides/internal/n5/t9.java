package com.aspose.slides.internal.n5;

public abstract class t9 extends u3 implements y1 {
   protected u9 l6;

   public t9() {
   }

   public t9(u9 var1, r4 var2) {
      super(var2);
      this.l6 = var1;
   }

   @Override
   public void n5() {
      super.n5();
      if (this.l6 != null) {
         this.l6.u3(0);
      }

      if (this.n5 != null) {
         this.n5.t2 = null;
         this.n5.e2 = 0;
         this.n5.y4 = 0;
         this.n5.s7 = -1;
         this.n5.n3 = -1;
         this.n5.x8 = -1;
         this.n5.t9 = null;
      }
   }

   @Override
   public y2 h0() {
      while (true) {
         this.n5.t2 = null;
         this.n5.y4 = 0;
         this.n5.s7 = this.l6.l6();
         this.n5.n3 = this.l6.h0();
         this.n5.x8 = this.l6.u9();
         this.n5.t9 = null;
         if (this.l6.n5(1) == -1) {
            return y2.s7;
         }

         try {
            this.c8();
            if (this.n5.t2 == null) {
               this.t2();
            } else if (this.n5.t2 == y2.n3) {
               continue;
            }

            return this.n5.t2;
         } catch (m3 var2) {
            this.n5(var2);
            this.k5(var2);
         } catch (w1 var3) {
            this.n5(var3);
         }
      }
   }

   public abstract void c8() throws w1;

   public void l6(y2 var1) {
      this.n5.t2 = var1;
   }

   public y2 t2() {
      t2 var1 = new t2(this.l6, this.n5.e2, this.n5.y4, this.n5.s7, this.x8() - 1);
      var1.n5(this.n5.x8);
      var1.n5(this.n5.t9);
      var1.l6(this.n5.n3);
      this.l6(var1);
      return var1;
   }

   public void l6(String var1) throws z3 {
      int var2 = 0;

      while (var2 < var1.length()) {
         if (this.l6.n5(1) != var1.charAt(var2)) {
            if (this.n5.h0 > 0) {
               this.n5.a6 = true;
               return;
            }

            z3 var3 = new z3(var1.charAt(var2), this.l6);
            this.k5(var3);
            throw var3;
         }

         var2++;
         this.l6.n5();
         this.n5.a6 = false;
      }
   }

   public void s7() {
      this.l6.n5();
   }

   public void n5(int var1) throws z3 {
      if (this.l6.n5(1) != var1) {
         if (this.n5.h0 > 0) {
            this.n5.a6 = true;
         } else {
            z3 var2 = new z3(var1, this.l6);
            this.k5(var2);
            throw var2;
         }
      } else {
         this.l6.n5();
         this.n5.a6 = false;
      }
   }

   public void n5(int var1, int var2) throws t4 {
      if (this.l6.n5(1) >= var1 && this.l6.n5(1) <= var2) {
         this.l6.n5();
         this.n5.a6 = false;
      } else if (this.n5.h0 > 0) {
         this.n5.a6 = true;
      } else {
         t4 var3 = new t4(var1, var2, this.l6);
         this.k5(var3);
         throw var3;
      }
   }

   public int x8() {
      return this.l6.l6();
   }

   @Override
   public void n5(w1 var1) {
      this.n5(this.u9(), var1);
   }

   @Override
   public String n5(w1 var1, String[] var2) {
      String var3 = null;
      if (var1 instanceof z3) {
         z3 var4 = (z3)var1;
         var3 = "mismatched character " + this.l6(var1.c8) + " expecting " + this.l6(var4.n5);
      } else if (var1 instanceof m3) {
         m3 var6 = (m3)var1;
         var3 = "no viable alternative at character " + this.l6(var1.c8);
      } else if (var1 instanceof n3) {
         n3 var7 = (n3)var1;
         var3 = "required (...)+ loop did not match anything at character " + this.l6(var1.c8);
      } else if (var1 instanceof z1) {
         z1 var8 = (z1)var1;
         var3 = "mismatched character " + this.l6(var1.c8) + " expecting set " + var8.n5;
      } else if (var1 instanceof q0) {
         q0 var9 = (q0)var1;
         var3 = "mismatched character " + this.l6(var1.c8) + " expecting set " + var9.n5;
      } else if (var1 instanceof t4) {
         t4 var10 = (t4)var1;
         var3 = "mismatched character " + this.l6(var1.c8) + " expecting set " + this.l6(var10.n5) + ".." + this.l6(var10.l6);
      } else {
         var3 = super.n5(var1, var2);
      }

      return var3;
   }

   public String l6(int var1) {
      String var2 = String.valueOf((char)var1);
      switch (var1) {
         case -1:
            var2 = "<EOF>";
            break;
         case 9:
            var2 = "\\t";
            break;
         case 10:
            var2 = "\\n";
            break;
         case 13:
            var2 = "\\r";
      }

      return "'" + var2 + "'";
   }

   public void k5(w1 var1) {
      this.l6.n5();
   }
}
