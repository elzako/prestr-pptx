package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;

public class x5 extends c7 implements a3 {
   private i8 n5;
   private int l6;
   private int k5;
   private int u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private w2 t2;

   public x5(l0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("node");
      }

      this.n5 = new i8(var1);
      this.k5 = 0;
      this.u3 = 0;
      this.a6 = false;
      this.l6 = 0;
      this.u9 = false;
      this.h0 = false;
   }

   public final boolean t2() {
      return this.u3 == 1;
   }

   @Override
   public int s7() {
      return this.t2() ? this.l6 : 0;
   }

   @Override
   public String x8() {
      return !this.t2() ? com.aspose.slides.ms.System.d1.n5 : this.n5.k5();
   }

   @Override
   public String n3() {
      return !this.t2() ? com.aspose.slides.ms.System.d1.n5 : this.n5.u3();
   }

   @Override
   public String y4() {
      return !this.t2() ? com.aspose.slides.ms.System.d1.n5 : this.n5.l6();
   }

   @Override
   public String e2() {
      return !this.t2() ? com.aspose.slides.ms.System.d1.n5 : this.n5.u9();
   }

   @Override
   public boolean t9() {
      return !this.t2() ? false : this.n5.h0();
   }

   @Override
   public String z1() {
      return !this.t2() ? com.aspose.slides.ms.System.d1.n5 : this.n5.c8();
   }

   @Override
   public int t4() {
      return this.k5;
   }

   @Override
   public String q0() {
      return this.n5.t2();
   }

   @Override
   public boolean z3() {
      return true;
   }

   @Override
   public boolean m1() {
      return !this.t2() ? false : this.n5.x8();
   }

   @Override
   public boolean l6() {
      return !this.t2() ? false : this.n5.n3();
   }

   @Override
   public int k7() {
      return !this.t2() ? 0 : this.n5.s7();
   }

   @Override
   public com.aspose.slides.internal.b8c.u4 m3() {
      return !this.t2() ? null : this.n5.y4();
   }

   @Override
   public int z8() {
      return this.t2() && this.l6 != 15 ? this.n5.t9() : 0;
   }

   @Override
   public String u3(String var1) {
      return !this.t2() ? null : this.n5.k5(var1);
   }

   @Override
   public String k5(int var1) {
      if (!this.t2()) {
         throw new ArgumentOutOfRangeException("attributeIndex");
      } else {
         return this.n5.k5(var1);
      }
   }

   @Override
   public boolean k5(String var1) {
      if (!this.t2()) {
         return false;
      }

      int[] var2 = new int[]{this.k5};
      int[] var3 = new int[]{this.l6};
      this.n5.n5(var2, var3);
      this.k5 = var2[0];
      this.l6 = var3[0];
      if (this.n5.u3(var1)) {
         this.k5++;
         this.l6 = this.n5.n5();
         if (this.c8) {
            this.u6();
         }

         return true;
      } else {
         var2[0] = this.k5;
         this.n5.n5(var2);
         this.k5 = var2[0];
         return false;
      }
   }

   @Override
   public void l6(int var1) {
      if (!this.t2()) {
         throw new ArgumentOutOfRangeException("attributeIndex");
      }

      int[] var2 = new int[]{this.k5};
      int[] var3 = new int[]{this.l6};
      this.n5.n5(var2, var3);
      this.k5 = var2[0];
      this.l6 = var3[0];

      try {
         if (this.z8() <= 0) {
            throw new ArgumentOutOfRangeException("attributeIndex");
         }

         this.n5.a6(var1);
         if (this.c8) {
            this.u6();
         }
      } catch (RuntimeException var5) {
         var2[0] = this.k5;
         this.n5.n5(var2);
         this.k5 = var2[0];
         throw var5;
      }

      this.k5++;
      this.l6 = this.n5.n5();
   }

   @Override
   public boolean k5() {
      if (!this.t2()) {
         return false;
      }

      int[] var1 = new int[]{this.k5};
      int[] var2 = new int[]{this.l6};
      this.n5.n5(var1, var2);
      this.k5 = var1[0];
      this.l6 = var2[0];
      if (this.z8() > 0) {
         this.n5.a6(0);
         this.k5++;
         this.l6 = this.n5.n5();
         if (this.c8) {
            this.u6();
         }

         return true;
      } else {
         var1[0] = this.k5;
         this.n5.n5(var1);
         this.k5 = var1[0];
         return false;
      }
   }

   @Override
   public boolean u3() {
      if (this.t2() && this.l6 != 15) {
         this.n5.u3(this.k5);
         int[] var1 = new int[]{this.k5};
         this.n5.l6(var1);
         this.k5 = var1[0];
         var1[0] = this.k5;
         boolean var2 = this.n5.k5(var1);
         this.k5 = var1[0];
         if (var2) {
            this.l6 = this.n5.n5();
            if (this.c8) {
               this.u6();
            }

            return true;
         } else {
            var1[0] = this.k5;
            this.n5.n5(var1);
            this.k5 = var1[0];
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean a6() {
      if (!this.t2()) {
         return false;
      }

      this.n5.u3(this.k5);
      int[] var1 = new int[]{this.k5};
      this.n5.l6(var1);
      this.k5 = var1[0];
      if (this.n5.z3()) {
         this.k5--;
         this.l6 = this.n5.n5();
         if (this.c8) {
            this.u6();
         }

         return true;
      } else {
         var1[0] = this.k5;
         this.n5.n5(var1);
         this.k5 = var1[0];
         return false;
      }
   }

   @Override
   public boolean u9() {
      return this.l6(false);
   }

   private boolean l6(boolean var1) {
      if (this.a6) {
         return false;
      }

      if (this.u3 == 0) {
         if (this.n5.n5() == 9 || this.n5.n5() == 11) {
            this.h0 = true;
            if (!this.k5(var1)) {
               this.u3 = 2;
               return false;
            }
         }

         this.v4();
         this.u3 = 1;
         this.l6 = this.n5.n5();
         this.k5 = 0;
         return true;
      } else {
         if (this.c8) {
            this.u6();
         }

         boolean var2 = false;
         if (this.n5.a6()) {
            return false;
         }

         this.v4();
         var2 = this.k5(var1);
         if (var2) {
            return true;
         }

         if (this.u3 == 0 || this.u3 == 1) {
            this.u3 = 2;
         }

         if (this.u3 == 3) {
            this.l6 = 0;
         }

         return false;
      }
   }

   private boolean k5(boolean var1) {
      if (this.u3 != 1 && this.u3 != 0) {
         this.l6 = 0;
         return false;
      }

      boolean var2 = !var1;
      int var3 = this.n5.n5();
      var2 = var2 && this.l6 != 15 && this.l6 != 16 && (var3 == 1 || var3 == 5 && this.u9 || (this.n5.n5() == 9 || this.n5.n5() == 11) && this.u3 == 0);
      if (var2) {
         if (this.n5.t4()) {
            this.l6 = this.n5.n5();
            this.k5++;
            if (this.u9) {
               this.u9 = false;
            }

            return true;
         } else if (this.n5.n5() == 1 && !this.n5.x8()) {
            this.l6 = 15;
            return true;
         } else if (this.n5.n5() == 5 && this.u9) {
            this.u9 = false;
            this.l6 = 16;
            return true;
         } else {
            return this.a6(var1);
         }
      } else if (this.n5.n5() == 5 && this.u9) {
         if (this.n5.t4()) {
            this.l6 = this.n5.n5();
            this.k5++;
         } else {
            this.l6 = 16;
         }

         this.u9 = false;
         return true;
      } else {
         return this.a6(var1);
      }
   }

   private void z7() {
      this.a6 = true;
      this.u3 = 3;
      this.l6 = 0;
   }

   private boolean u3(boolean var1) {
      if (!var1 && this.l6 != 15 && this.n5.n5() == 1 && !this.n5.x8()) {
         this.l6 = 15;
         return true;
      } else {
         this.z7();
         return false;
      }
   }

   private boolean a6(boolean var1) {
      if (this.u3 == 2) {
         return false;
      }

      if (!this.h0 && this.k5 == 0) {
         return this.u3(var1);
      }

      if (this.n5.q0()) {
         this.l6 = this.n5.n5();
         return true;
      }

      if (this.k5 == 0) {
         return this.u3(var1);
      }

      if (this.n5.z1()) {
         if (this.n5.n5() == 1) {
            this.k5--;
            this.l6 = 15;
            return true;
         } else if (this.n5.n5() == 5) {
            this.k5--;
            this.l6 = 16;
            return true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private void v4() {
      int[] var1 = new int[]{this.k5};
      int[] var2 = new int[]{this.l6};
      this.n5.n5(var1, var2);
      this.k5 = var1[0];
      this.l6 = var2[0];
   }

   @Override
   public boolean j5() {
      return this.u3 != 4 && this.a6;
   }

   @Override
   public void w1() {
      this.u3 = 4;
   }

   @Override
   public int h0() {
      return this.u3;
   }

   @Override
   public void r4() {
      this.l6(true);
   }

   @Override
   public String c4() {
      if (this.s7() == 5 && this.u9 && !this.u9()) {
         throw new InvalidOperationException(v3.n5("Operation is not valid due to the current state of the object."));
      } else {
         return super.c4();
      }
   }

   @Override
   public boolean y2() {
      return this.z8() > 0;
   }

   @Override
   public z9 y1() {
      return this.n5.e2();
   }

   @Override
   public String n5(String var1) {
      if (!this.t2()) {
         return null;
      }

      String var2 = this.n5.a6(var1);
      return var2 != null && var2.length() == 0 ? null : var2;
   }

   @Override
   public void a0() {
      if (this.t2() && this.l6 == 5) {
         this.u9 = true;
      } else {
         throw new InvalidOperationException(v3.n5("The node is not an expandable 'EntityReference' node."));
      }
   }

   @Override
   public boolean c8() {
      if (!this.t2()) {
         return false;
      } else {
         int[] var1 = new int[]{this.k5};
         boolean[] var2 = new boolean[]{this.u9};
         int[] var3 = new int[]{this.l6};
         boolean var4 = this.n5.n5(var1, var2, var3);
         this.k5 = var1[0];
         this.u9 = var2[0];
         this.l6 = var3[0];
         if (var4) {
            this.c8 = false;
            return true;
         } else {
            return false;
         }
      }
   }

   private void u6() {
      this.c8 = false;
      this.t2.n5();
   }

   @Override
   public final IGenericDictionary<String, String> n5(int var1) {
      return this.n5.u9(var1);
   }

   @Override
   public final String l6(String var1) {
      return this.n5.u9(var1);
   }

   @Override
   public z7 d2() {
      return this.n5.m1().getDtdSchemaInfo();
   }
}
