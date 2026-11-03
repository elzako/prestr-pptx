package com.aspose.slides.internal.w4w;

import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.ms.System.d1;

class t2$n5 {
   private int l6;
   private com.aspose.slides.internal.x7n.s7 k5;
   private String u3;
   boolean n5;
   private String a6;
   private String u9;
   private int h0 = 0;
   private int c8 = 0;
   private int t2 = 0;
   private String s7 = null;
   private String x8 = null;
   private String n3 = null;
   private int y4 = 1;
   private char e2;
   private int t9;
   private int z1;
   private byte[] t4;
   private char[] q0;
   private RuntimeException z3;
   private boolean m1 = false;
   private boolean k7 = false;
   private boolean m3 = false;
   private boolean z8 = false;
   private boolean j5 = false;

   public RuntimeException n5() {
      return this.z3;
   }

   public t2$n5(int var1, com.aspose.slides.internal.x7n.s7 var2, String var3, byte[] var4, char[] var5, int var6, int var7, boolean var8) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
      this.t4 = var4;
      this.q0 = var5;
      this.t9 = var6;
      this.z1 = var7;
      this.n5 = var8;
      this.a6 = var2.s3();
      this.u9 = var2.z1();
      if ((var1 & 32) != 0) {
         this.s7 = var2.q0();
         this.h0 = this.s7.length();
      }

      if ((var1 & 64) != 0) {
         this.x8 = var2.z3();
         this.c8 = this.x8.length();
      }

      if ((var1 & 256) != 0) {
         this.n3 = var2.t2();
         this.t2 = this.n3.length();
      }
   }

   private boolean h0() {
      if (!this.k7) {
         boolean var1 = this.s7();
         if (var1 || this.x8()) {
            this.y4 = 2;
            this.t9 = this.t9 + ((var1 ? this.a6.length() : this.u9.length()) - 1);
            this.m1 = !var1;
            this.k7 = true;
            return true;
         }
      }

      return false;
   }

   private boolean c8() {
      if (this.s7()) {
         this.y4 = 2;
         this.t9 = this.t9 + (this.a6.length() - 1);
         return true;
      } else if (this.x8()) {
         this.y4 = 2;
         this.q0[this.z1] = '-';
         this.t4[this.z1++] = 45;
         this.t9 = this.t9 + (this.u9.length() - 1);
         return true;
      } else {
         return false;
      }
   }

   private boolean t2() {
      return ((this.l6 & 4) != 0 || (this.l6 & 8) != 0) && this.h0();
   }

   private boolean s7() {
      return this.e2 == this.a6.charAt(0) && d1.a6(d1.l6(this.u3, this.t9, this.a6.length()), this.a6);
   }

   private boolean x8() {
      return this.e2 == this.u9.charAt(0) && d1.a6(d1.l6(this.u3, this.t9, this.u9.length()), this.u9);
   }

   private boolean n3() {
      return this.s7() || this.x8();
   }

   public t2$n5$n5 l6() {
      if (this.n3()) {
         if ((this.l6 & 4) == 0) {
            if (!this.n5) {
               this.z3 = new FormatException();
            }

            return t2$n5$n5.u3;
         }

         if (this.t2()) {
            return t2$n5$n5.k5;
         }
      }

      this.y4 = 2;
      return this.k5();
   }

   private t2$n5$n5 n5(int var1) {
      if (this.t2 <= 0 || this.n3.charAt(0) != this.e2 || !d1.a6(d1.l6(this.u3, this.t9, this.t2), this.n3)) {
         return t2$n5$n5.n5;
      }

      if (!this.m3) {
         this.t9 = this.t9 + (this.t2 - 1);
         this.y4 = var1;
         this.m3 = true;
         this.j5 = this.z8;
         return t2$n5$n5.l6;
      }

      if (!this.n5) {
         this.z3 = new FormatException();
      }

      return t2$n5$n5.u3;
   }

   public t2$n5$n5 k5() {
      if (com.aspose.slides.ms.System.t9.u3(this.e2)) {
         if (!this.j5) {
            this.z8 = true;
            this.q0[this.z1] = this.e2;
            this.t4[this.z1++] = (byte)this.e2;
            return t2$n5$n5.l6;
         }

         if (!this.n5) {
            this.z3 = new FormatException(d1.n5(new Object[]{"Currency inside a number: ", this.e2}));
         }

         return t2$n5$n5.u3;
      } else if (this.e2 != 'e' && this.e2 != 'E') {
         if (this.h0 > 0 && this.s7.charAt(0) == this.e2 && d1.l6(this.u3, this.t9, this.s7, 0, this.h0) == 0) {
            this.q0[this.z1] = '.';
            this.t4[this.z1++] = 46;
            this.t9 = this.t9 + (this.h0 - 1);
            this.y4 = 3;
            return t2$n5$n5.l6;
         }

         if (this.c8 <= 0
            || this.x8.charAt(0) != this.e2 && (!com.aspose.slides.ms.System.t9.t9(this.x8.charAt(0)) || !com.aspose.slides.ms.System.t9.t9(this.e2))) {
            t2$n5$n5 var1 = this.n5(1);
            if (var1 != t2$n5$n5.n5) {
               return var1;
            }

            if (com.aspose.slides.ms.System.t9.t9(this.e2)) {
               return this.e2();
            }

            if ((this.l6 & 8) != 0 && this.t2()) {
               return t2$n5$n5.k5;
            }

            if (!this.n5) {
               this.z3 = new FormatException(d1.n5(new Object[]{"Unknown char: ", this.e2}));
            }

            return t2$n5$n5.u3;
         } else {
            this.t9 = this.t9 + (this.c8 - 1);
            this.y4 = 2;
            return t2$n5$n5.l6;
         }
      } else {
         this.y4 = 3;
         return this.y4();
      }
   }

   private t2$n5$n5 y4() {
      if (com.aspose.slides.ms.System.t9.u3(this.e2)) {
         this.q0[this.z1] = this.e2;
         this.t4[this.z1++] = (byte)this.e2;
         return t2$n5$n5.l6;
      }

      if (this.e2 != 'e' && this.e2 != 'E') {
         t2$n5$n5 var1 = this.n5(2);
         if (var1 != t2$n5$n5.n5) {
            return var1;
         }

         if (com.aspose.slides.ms.System.t9.t9(this.e2)) {
            return this.e2();
         }

         if (!this.n5) {
            this.z3 = new FormatException(d1.n5(new Object[]{"Unknown char: ", this.e2}));
         }

         return t2$n5$n5.u3;
      } else if ((this.l6 & 128) == 0) {
         if (!this.n5) {
            this.z3 = new FormatException(d1.n5(new Object[]{"Unknown char: ", this.e2}));
         }

         return t2$n5$n5.u3;
      } else {
         this.q0[this.z1] = this.e2;
         this.t4[this.z1++] = (byte)this.e2;
         this.y4 = 4;
         return t2$n5$n5.l6;
      }
   }

   public t2$n5$n5 u3() {
      if (!com.aspose.slides.ms.System.t9.u3(this.e2)) {
         if (this.c8()) {
            return t2$n5$n5.k5;
         }

         if (com.aspose.slides.ms.System.t9.t9(this.e2)) {
            return this.e2();
         }

         if (!this.n5) {
            this.z3 = new FormatException(d1.n5(new Object[]{"Unknown char: ", this.e2}));
         }

         return t2$n5$n5.u3;
      } else {
         this.y4 = 5;
         return t2$n5$n5.n5;
      }
   }

   public t2$n5$n5 a6() {
      if (com.aspose.slides.ms.System.t9.u3(this.e2)) {
         this.q0[this.z1] = this.e2;
         this.t4[this.z1++] = (byte)this.e2;
         return t2$n5$n5.l6;
      }

      if (com.aspose.slides.ms.System.t9.t9(this.e2)) {
         return this.e2();
      }

      if (!this.n5) {
         this.z3 = new FormatException(d1.n5(new Object[]{"Unknown char: ", this.e2}));
      }

      return t2$n5$n5.u3;
   }

   private t2$n5$n5 e2() {
      if (com.aspose.slides.ms.System.t9.t9(this.e2)) {
         if (this.k7 && !this.z8 && !this.m3) {
            if (!this.n5) {
               this.z3 = new FormatException("Whitespace between sign and number");
            }

            return t2$n5$n5.u3;
         }

         if ((this.l6 & 1) != 0 && !this.z8) {
            this.y4 = 6;
            return t2$n5$n5.l6;
         }

         if ((this.l6 & 2) != 0 && this.z8) {
            this.y4 = 6;
            return t2$n5$n5.l6;
         }
      }

      if (com.aspose.slides.ms.System.t9.u3(this.e2) || this.h0 > 0 && this.s7.charAt(0) == this.e2) {
         if (!this.z8) {
            this.y4 = 2;
            return this.k5();
         }

         if (!this.n5) {
            this.z3 = new FormatException("Unknown char");
         }

         return t2$n5$n5.u3;
      } else {
         t2$n5$n5 var1 = this.n5(6);
         if (var1 != t2$n5$n5.n5) {
            return var1;
         }

         if ((this.l6 & 4) != 0 && !this.z8 && this.t2()) {
            return t2$n5$n5.k5;
         }

         if ((this.l6 & 8) != 0 && this.z8 && this.t2()) {
            return t2$n5$n5.k5;
         }

         if (!this.n5) {
            this.z3 = new FormatException("Unknown char");
         }

         return t2$n5$n5.u3;
      }
   }

   public int u9() {
      return this.y4;
   }

   // $VF: synthetic method
   static int n5(t2$n5 var0, int var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static int n5(t2$n5 var0) {
      return var0.t9;
   }

   // $VF: synthetic method
   static int l6(t2$n5 var0) {
      return var0.t9++;
   }

   // $VF: synthetic method
   static char n5(t2$n5 var0, char var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static char k5(t2$n5 var0) {
      return var0.e2;
   }

   // $VF: synthetic method
   static int l6(t2$n5 var0, int var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static t2$n5$n5 u3(t2$n5 var0) {
      return var0.e2();
   }

   // $VF: synthetic method
   static t2$n5$n5 a6(t2$n5 var0) {
      return var0.y4();
   }

   // $VF: synthetic method
   static int u9(t2$n5 var0) {
      return var0.y4;
   }

   // $VF: synthetic method
   static byte[] h0(t2$n5 var0) {
      return var0.t4;
   }

   // $VF: synthetic method
   static int c8(t2$n5 var0) {
      return var0.z1;
   }

   // $VF: synthetic method
   static char[] t2(t2$n5 var0) {
      return var0.q0;
   }

   // $VF: synthetic method
   static boolean s7(t2$n5 var0) {
      return var0.m1;
   }
}
