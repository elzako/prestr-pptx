package com.aspose.slides.internal.q2;

import com.aspose.slides.internal.n5.m3;
import com.aspose.slides.internal.n5.n3;
import com.aspose.slides.internal.n5.q0;
import com.aspose.slides.internal.n5.r4;
import com.aspose.slides.internal.n5.t9;
import com.aspose.slides.internal.n5.u9;
import com.aspose.slides.internal.n5.w1;
import com.aspose.slides.internal.n5.x8;
import com.aspose.slides.internal.n5.y2;
import com.aspose.slides.internal.n5.y4;

public class n5 extends t9 {
   private y2 k7;
   protected n5$n5 k5 = new n5$n5(this, this);
   protected n5$l6 u3 = new n5$l6(this, this);
   static final String[] a6 = new String[]{
      "\u0001\u0003\u0001\uffff\u0001\u0001\t\u0002", "\u0001\u0005", "\u0001\u0005\u0001\uffff\n\u0006", "", "", "", "\u0001\u0005\u0001\uffff\n\u0006"
   };
   static final short[] u9 = com.aspose.slides.internal.n5.x8.n5("\u0001\uffff\u0002\u0004\u0003\uffff\u0001\u0004");
   static final short[] h0 = com.aspose.slides.internal.n5.x8.n5("\u0007\uffff");
   static final char[] c8 = com.aspose.slides.internal.n5.x8.l6("\u0003.\u0003\uffff\u0001.");
   static final char[] t2 = com.aspose.slides.internal.n5.x8.l6("\u00019\u0001.\u00019\u0003\uffff\u00019");
   static final short[] s7 = com.aspose.slides.internal.n5.x8.n5("\u0003\uffff\u0001\u0002\u0001\u0003\u0001\u0001\u0001\uffff");
   static final short[] x8 = com.aspose.slides.internal.n5.x8.n5("\u0007\uffff}>");
   static final short[][] n3;
   static final String[] y4;
   static final short[] e2;
   static final short[] t9;
   static final char[] z1;
   static final char[] t4;
   static final short[] q0;
   static final short[] z3;
   static final short[][] m1;

   private boolean f1() {
      if (this.k7 == null) {
         return true;
      }

      switch (this.k7.n5()) {
         case 4:
         case 5:
         case 6:
         case 24:
         case 66:
         case 68:
         case 148:
         case 149:
         case 159:
         case 160:
         case 161:
            return false;
         default:
            return true;
      }
   }

   private void k2() throws w1 {
      int var1 = this.l6.n5(1);
      if (!this.u3(var1)) {
         throw new m3();
      }

      this.s7();

      while (true) {
         var1 = this.l6.n5(1);
         if (var1 != 36 && (var1 < 48 || var1 > 57) && (var1 < 65 || var1 > 90) && var1 != 92 && var1 != 95 && (var1 < 97 || var1 > 122) && !this.k5(var1)) {
            return;
         }

         this.s2();
      }
   }

   private boolean k5(int var1) {
      return com.aspose.slides.ms.System.t9.h0((char)var1);
   }

   private boolean u3(int var1) {
      return com.aspose.slides.ms.System.t9.u9((char)var1);
   }

   @Override
   public y2 h0() {
      y2 var1 = super.h0();
      if (var1.a6() == 0) {
         this.k7 = var1;
      }

      return var1;
   }

   public n5() {
   }

   public n5(u9 var1) {
      this(var1, new r4());
   }

   public n5(u9 var1, r4 var2) {
      super(var1, var2);
   }

   public final void n3() throws w1 {
      this.l6("null");
      this.n5.e2 = 4;
      this.n5.y4 = 0;
   }

   public final void y4() throws w1 {
      this.l6("true");
      this.n5.e2 = 5;
      this.n5.y4 = 0;
   }

   public final void e2() throws w1 {
      this.l6("false");
      this.n5.e2 = 6;
      this.n5.y4 = 0;
   }

   public final void t9() throws w1 {
      this.l6("break");
      this.n5.e2 = 7;
      this.n5.y4 = 0;
   }

   public final void z1() throws w1 {
      this.l6("case");
      this.n5.e2 = 8;
      this.n5.y4 = 0;
   }

   public final void t4() throws w1 {
      this.l6("catch");
      this.n5.e2 = 9;
      this.n5.y4 = 0;
   }

   public final void q0() throws w1 {
      this.l6("continue");
      this.n5.e2 = 10;
      this.n5.y4 = 0;
   }

   public final void z3() throws w1 {
      this.l6("default");
      this.n5.e2 = 11;
      this.n5.y4 = 0;
   }

   public final void m1() throws w1 {
      this.l6("delete");
      this.n5.e2 = 12;
      this.n5.y4 = 0;
   }

   public final void k7() throws w1 {
      this.l6("do");
      this.n5.e2 = 13;
      this.n5.y4 = 0;
   }

   public final void m3() throws w1 {
      this.l6("else");
      this.n5.e2 = 14;
      this.n5.y4 = 0;
   }

   public final void z8() throws w1 {
      this.l6("finally");
      this.n5.e2 = 15;
      this.n5.y4 = 0;
   }

   public final void j5() throws w1 {
      this.l6("for");
      this.n5.e2 = 16;
      this.n5.y4 = 0;
   }

   public final void w1() throws w1 {
      this.l6("function");
      this.n5.e2 = 17;
      this.n5.y4 = 0;
   }

   public final void r4() throws w1 {
      this.l6("if");
      this.n5.e2 = 18;
      this.n5.y4 = 0;
   }

   public final void c4() throws w1 {
      this.l6("in");
      this.n5.e2 = 19;
      this.n5.y4 = 0;
   }

   public final void y2() throws w1 {
      this.l6("instanceof");
      this.n5.e2 = 20;
      this.n5.y4 = 0;
   }

   public final void y1() throws w1 {
      this.l6("new");
      this.n5.e2 = 21;
      this.n5.y4 = 0;
   }

   public final void a0() throws w1 {
      this.l6("return");
      this.n5.e2 = 22;
      this.n5.y4 = 0;
   }

   public final void d2() throws w1 {
      this.l6("switch");
      this.n5.e2 = 23;
      this.n5.y4 = 0;
   }

   public final void d5() throws w1 {
      this.l6("this");
      this.n5.e2 = 24;
      this.n5.y4 = 0;
   }

   public final void s3() throws w1 {
      this.l6("throw");
      this.n5.e2 = 25;
      this.n5.y4 = 0;
   }

   public final void p8() throws w1 {
      this.l6("try");
      this.n5.e2 = 26;
      this.n5.y4 = 0;
   }

   public final void f2() throws w1 {
      this.l6("typeof");
      this.n5.e2 = 27;
      this.n5.y4 = 0;
   }

   public final void i1() throws w1 {
      this.l6("var");
      this.n5.e2 = 28;
      this.n5.y4 = 0;
   }

   public final void e5() throws w1 {
      this.l6("void");
      this.n5.e2 = 29;
      this.n5.y4 = 0;
   }

   public final void b3() throws w1 {
      this.l6("while");
      this.n5.e2 = 30;
      this.n5.y4 = 0;
   }

   public final void o0() throws w1 {
      this.l6("with");
      this.n5.e2 = 31;
      this.n5.y4 = 0;
   }

   public final void z7() throws w1 {
      this.l6("abstract");
      this.n5.e2 = 32;
      this.n5.y4 = 0;
   }

   public final void v4() throws w1 {
      this.l6("boolean");
      this.n5.e2 = 33;
      this.n5.y4 = 0;
   }

   public final void u6() throws w1 {
      this.l6("byte");
      this.n5.e2 = 34;
      this.n5.y4 = 0;
   }

   public final void t1() throws w1 {
      this.l6("char");
      this.n5.e2 = 35;
      this.n5.y4 = 0;
   }

   public final void a5() throws w1 {
      this.l6("class");
      this.n5.e2 = 36;
      this.n5.y4 = 0;
   }

   public final void h2() throws w1 {
      this.l6("const");
      this.n5.e2 = 37;
      this.n5.y4 = 0;
   }

   public final void v0() throws w1 {
      this.l6("debugger");
      this.n5.e2 = 38;
      this.n5.y4 = 0;
   }

   public final void f0() throws w1 {
      this.l6("double");
      this.n5.e2 = 39;
      this.n5.y4 = 0;
   }

   public final void a3() throws w1 {
      this.l6("enum");
      this.n5.e2 = 40;
      this.n5.y4 = 0;
   }

   public final void p3() throws w1 {
      this.l6("export");
      this.n5.e2 = 41;
      this.n5.y4 = 0;
   }

   public final void x9() throws w1 {
      this.l6("extends");
      this.n5.e2 = 42;
      this.n5.y4 = 0;
   }

   public final void y0() throws w1 {
      this.l6("final");
      this.n5.e2 = 43;
      this.n5.y4 = 0;
   }

   public final void j9() throws w1 {
      this.l6("float");
      this.n5.e2 = 44;
      this.n5.y4 = 0;
   }

   public final void z6() throws w1 {
      this.l6("goto");
      this.n5.e2 = 45;
      this.n5.y4 = 0;
   }

   public final void e9() throws w1 {
      this.l6("implements");
      this.n5.e2 = 46;
      this.n5.y4 = 0;
   }

   public final void o5() throws w1 {
      this.l6("import");
      this.n5.e2 = 47;
      this.n5.y4 = 0;
   }

   public final void j8() throws w1 {
      this.l6("int");
      this.n5.e2 = 48;
      this.n5.y4 = 0;
   }

   public final void w2() throws w1 {
      this.l6("interface");
      this.n5.e2 = 49;
      this.n5.y4 = 0;
   }

   public final void s0() throws w1 {
      this.l6("long");
      this.n5.e2 = 50;
      this.n5.y4 = 0;
   }

   public final void v8() throws w1 {
      this.l6("native");
      this.n5.e2 = 51;
      this.n5.y4 = 0;
   }

   public final void v3() throws w1 {
      this.l6("package");
      this.n5.e2 = 52;
      this.n5.y4 = 0;
   }

   public final void g7() throws w1 {
      this.l6("private");
      this.n5.e2 = 53;
      this.n5.y4 = 0;
   }

   public final void j4() throws w1 {
      this.l6("protected");
      this.n5.e2 = 54;
      this.n5.y4 = 0;
   }

   public final void i9() throws w1 {
      this.l6("public");
      this.n5.e2 = 55;
      this.n5.y4 = 0;
   }

   public final void f5() throws w1 {
      this.l6("short");
      this.n5.e2 = 56;
      this.n5.y4 = 0;
   }

   public final void j3() throws w1 {
      this.l6("static");
      this.n5.e2 = 57;
      this.n5.y4 = 0;
   }

   public final void n1() throws w1 {
      this.l6("super");
      this.n5.e2 = 58;
      this.n5.y4 = 0;
   }

   public final void p6() throws w1 {
      this.l6("synchronized");
      this.n5.e2 = 59;
      this.n5.y4 = 0;
   }

   public final void d1() throws w1 {
      this.l6("throws");
      this.n5.e2 = 60;
      this.n5.y4 = 0;
   }

   public final void s4() throws w1 {
      this.l6("transient");
      this.n5.e2 = 61;
      this.n5.y4 = 0;
   }

   public final void h6() throws w1 {
      this.l6("volatile");
      this.n5.e2 = 62;
      this.n5.y4 = 0;
   }

   public final void y8() throws w1 {
      this.n5(123);
      this.n5.e2 = 63;
      this.n5.y4 = 0;
   }

   public final void c3() throws w1 {
      this.n5(125);
      this.n5.e2 = 64;
      this.n5.y4 = 0;
   }

   public final void l4() throws w1 {
      this.n5(40);
      this.n5.e2 = 65;
      this.n5.y4 = 0;
   }

   public final void i6() throws w1 {
      this.n5(41);
      this.n5.e2 = 66;
      this.n5.y4 = 0;
   }

   public final void a7() throws w1 {
      this.n5(91);
      this.n5.e2 = 67;
      this.n5.y4 = 0;
   }

   public final void r8() throws w1 {
      this.n5(93);
      this.n5.e2 = 68;
      this.n5.y4 = 0;
   }

   public final void r1() throws w1 {
      this.n5(46);
      this.n5.e2 = 69;
      this.n5.y4 = 0;
   }

   public final void y5() throws w1 {
      this.n5(59);
      this.n5.e2 = 70;
      this.n5.y4 = 0;
   }

   public final void k8() throws w1 {
      this.n5(44);
      this.n5.e2 = 71;
      this.n5.y4 = 0;
   }

   public final void b5() throws w1 {
      this.n5(60);
      this.n5.e2 = 72;
      this.n5.y4 = 0;
   }

   public final void u8() throws w1 {
      this.n5(62);
      this.n5.e2 = 73;
      this.n5.y4 = 0;
   }

   public final void w5() throws w1 {
      this.l6("<=");
      this.n5.e2 = 74;
      this.n5.y4 = 0;
   }

   public final void q1() throws w1 {
      this.l6(">=");
      this.n5.e2 = 75;
      this.n5.y4 = 0;
   }

   public final void u5() throws w1 {
      this.l6("==");
      this.n5.e2 = 76;
      this.n5.y4 = 0;
   }

   public final void w8() throws w1 {
      this.l6("!=");
      this.n5.e2 = 77;
      this.n5.y4 = 0;
   }

   public final void c2() throws w1 {
      this.l6("===");
      this.n5.e2 = 78;
      this.n5.y4 = 0;
   }

   public final void t3() throws w1 {
      this.l6("!==");
      this.n5.e2 = 79;
      this.n5.y4 = 0;
   }

   public final void u4() throws w1 {
      this.n5(43);
      this.n5.e2 = 80;
      this.n5.y4 = 0;
   }

   public final void s9() throws w1 {
      this.n5(45);
      this.n5.e2 = 81;
      this.n5.y4 = 0;
   }

   public final void p7() throws w1 {
      this.n5(42);
      this.n5.e2 = 82;
      this.n5.y4 = 0;
   }

   public final void z5() throws w1 {
      this.n5(37);
      this.n5.e2 = 83;
      this.n5.y4 = 0;
   }

   public final void h5() throws w1 {
      this.l6("++");
      this.n5.e2 = 84;
      this.n5.y4 = 0;
   }

   public final void a8() throws w1 {
      this.l6("--");
      this.n5.e2 = 85;
      this.n5.y4 = 0;
   }

   public final void f4() throws w1 {
      this.l6("<<");
      this.n5.e2 = 86;
      this.n5.y4 = 0;
   }

   public final void y9() throws w1 {
      this.l6(">>");
      this.n5.e2 = 87;
      this.n5.y4 = 0;
   }

   public final void a1() throws w1 {
      this.l6(">>>");
      this.n5.e2 = 88;
      this.n5.y4 = 0;
   }

   public final void w3() throws w1 {
      this.n5(38);
      this.n5.e2 = 89;
      this.n5.y4 = 0;
   }

   public final void i4() throws w1 {
      this.n5(124);
      this.n5.e2 = 90;
      this.n5.y4 = 0;
   }

   public final void q3() throws w1 {
      this.n5(94);
      this.n5.e2 = 91;
      this.n5.y4 = 0;
   }

   public final void q2() throws w1 {
      this.n5(33);
      this.n5.e2 = 92;
      this.n5.y4 = 0;
   }

   public final void p4() throws w1 {
      this.n5(126);
      this.n5.e2 = 93;
      this.n5.y4 = 0;
   }

   public final void d6() throws w1 {
      this.l6("&&");
      this.n5.e2 = 94;
      this.n5.y4 = 0;
   }

   public final void y6() throws w1 {
      this.l6("||");
      this.n5.e2 = 95;
      this.n5.y4 = 0;
   }

   public final void n7() throws w1 {
      this.n5(63);
      this.n5.e2 = 96;
      this.n5.y4 = 0;
   }

   public final void l5() throws w1 {
      this.n5(58);
      this.n5.e2 = 97;
      this.n5.y4 = 0;
   }

   public final void u2() throws w1 {
      this.n5(61);
      this.n5.e2 = 98;
      this.n5.y4 = 0;
   }

   public final void d9() throws w1 {
      this.l6("+=");
      this.n5.e2 = 99;
      this.n5.y4 = 0;
   }

   public final void c5() throws w1 {
      this.l6("-=");
      this.n5.e2 = 100;
      this.n5.y4 = 0;
   }

   public final void t5() throws w1 {
      this.l6("*=");
      this.n5.e2 = 101;
      this.n5.y4 = 0;
   }

   public final void j6() throws w1 {
      this.l6("%=");
      this.n5.e2 = 102;
      this.n5.y4 = 0;
   }

   public final void w9() throws w1 {
      this.l6("<<=");
      this.n5.e2 = 103;
      this.n5.y4 = 0;
   }

   public final void m8() throws w1 {
      this.l6(">>=");
      this.n5.e2 = 104;
      this.n5.y4 = 0;
   }

   public final void b9() throws w1 {
      this.l6(">>>=");
      this.n5.e2 = 105;
      this.n5.y4 = 0;
   }

   public final void r6() throws w1 {
      this.l6("&=");
      this.n5.e2 = 106;
      this.n5.y4 = 0;
   }

   public final void r5() throws w1 {
      this.l6("|=");
      this.n5.e2 = 107;
      this.n5.y4 = 0;
   }

   public final void h9() throws w1 {
      this.l6("^=");
      this.n5.e2 = 108;
      this.n5.y4 = 0;
   }

   public final void r7() throws w1 {
      this.n5(47);
      this.n5.e2 = 109;
      this.n5.y4 = 0;
   }

   public final void n9() throws w1 {
      this.l6("/=");
      this.n5.e2 = 110;
      this.n5.y4 = 0;
   }

   public final void a2() throws w1 {
      this.n5(92);
   }

   public final void h1() throws w1 {
      this.n5(34);
   }

   public final void t6() throws w1 {
      this.n5(39);
   }

   public final void v6() throws w1 {
      byte var1 = 0;
      int var2 = 0;

      while (true) {
         byte var3 = 2;
         int var4 = this.l6.n5(1);
         if (var4 == 9
            || var4 >= 11 && var4 <= 12
            || var4 == 32
            || var4 == 160
            || var4 == 5760
            || var4 == 6158
            || var4 >= 8192 && var4 <= 8202
            || var4 == 8239
            || var4 == 8287
            || var4 == 12288) {
            var3 = 1;
         }

         switch (var3) {
            case 1:
               if (this.l6.n5(1) != 9
                  && (this.l6.n5(1) < 11 || this.l6.n5(1) > 12)
                  && this.l6.n5(1) != 32
                  && this.l6.n5(1) != 160
                  && this.l6.n5(1) != 5760
                  && this.l6.n5(1) != 6158
                  && (this.l6.n5(1) < 8192 || this.l6.n5(1) > 8202)
                  && this.l6.n5(1) != 8239
                  && this.l6.n5(1) != 8287
                  && this.l6.n5(1) != 12288) {
                  q0 var5 = new q0(null, this.l6);
                  this.k5(var5);
                  throw var5;
               }

               this.l6.n5();
               var2++;
               break;
            default:
               if (var2 >= 1) {
                  var1 = 99;
                  this.n5.e2 = 139;
                  this.n5.y4 = var1;
                  return;
               }

               throw new n3(1, this.l6);
         }
      }
   }

   public final void x0() throws w1 {
      this.n5(10);
   }

   public final void o2() throws w1 {
      this.n5(13);
   }

   public final void e0() throws w1 {
      this.n5(8232);
   }

   public final void i2() throws w1 {
      this.n5(8233);
   }

   public final void x7() throws w1 {
      byte var1 = 0;
      byte var2 = 4;
      switch (this.l6.n5(1)) {
         case 10:
            var2 = 2;
            break;
         case 13:
            var2 = 1;
            break;
         case 8232:
            var2 = 3;
            break;
         case 8233:
            var2 = 4;
            break;
         default:
            throw new m3("", 2, 0, this.l6);
      }

      switch (var2) {
         case 1:
            this.o2();
            this.x0();
            break;
         case 2:
            this.x0();
            break;
         case 3:
            this.e0();
            break;
         case 4:
            this.i2();
      }

      var1 = 99;
      this.n5.e2 = 145;
      this.n5.y4 = var1;
   }

   public final void z0() throws w1 {
      byte var1 = 0;
      this.l6("/*");

      while (true) {
         byte var2 = 2;
         int var3 = this.l6.n5(1);
         if (var3 == 42) {
            int var4 = this.l6.n5(2);
            if (var4 == 47) {
               var2 = 2;
            } else if (var4 >= 0 && var4 <= 46 || var4 >= 48 && var4 <= 65535) {
               var2 = 1;
            }
         } else if (var3 >= 0 && var3 <= 41 || var3 >= 43 && var3 <= 65535) {
            var2 = 1;
         }

         switch (var2) {
            case 1:
               this.s7();
               break;
            default:
               this.l6("*/");
               var1 = 99;
               this.n5.e2 = 146;
               this.n5.y4 = var1;
               return;
         }
      }
   }

   public final void z9() throws w1 {
      byte var1 = 0;
      this.l6("//");

      while (true) {
         byte var2 = 2;
         int var3 = this.l6.n5(1);
         if (var3 >= 0 && var3 <= 9 || var3 >= 11 && var3 <= 12 || var3 >= 14 && var3 <= 8231 || var3 >= 8234 && var3 <= 65535) {
            var2 = 1;
         }

         switch (var2) {
            case 1:
               if ((this.l6.n5(1) < 0 || this.l6.n5(1) > 9)
                  && (this.l6.n5(1) < 11 || this.l6.n5(1) > 12)
                  && (this.l6.n5(1) < 14 || this.l6.n5(1) > 8231)
                  && (this.l6.n5(1) < 8234 || this.l6.n5(1) > 65535)) {
                  q0 var4 = new q0(null, this.l6);
                  this.k5(var4);
                  throw var4;
               }

               this.l6.n5();
               break;
            default:
               var1 = 99;
               this.n5.e2 = 147;
               this.n5.y4 = var1;
               return;
         }
      }
   }

   public final void f8() throws w1 {
      byte var1 = 5;
      switch (this.l6.n5(1)) {
         case 36:
            var1 = 3;
            break;
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
         case 58:
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         case 64:
         case 91:
         case 93:
         case 94:
         case 96:
         default:
            throw new m3("", 5, 0, this.l6);
         case 65:
         case 66:
         case 67:
         case 68:
         case 69:
         case 70:
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
         case 76:
         case 77:
         case 78:
         case 79:
         case 80:
         case 81:
         case 82:
         case 83:
         case 84:
         case 85:
         case 86:
         case 87:
         case 88:
         case 89:
         case 90:
            var1 = 2;
            break;
         case 92:
            var1 = 5;
            break;
         case 95:
            var1 = 4;
            break;
         case 97:
         case 98:
         case 99:
         case 100:
         case 101:
         case 102:
         case 103:
         case 104:
         case 105:
         case 106:
         case 107:
         case 108:
         case 109:
         case 110:
         case 111:
         case 112:
         case 113:
         case 114:
         case 115:
         case 116:
         case 117:
         case 118:
         case 119:
         case 120:
         case 121:
         case 122:
            var1 = 1;
      }

      switch (var1) {
         case 1:
            this.n5(97, 122);
            break;
         case 2:
            this.n5(65, 90);
            break;
         case 3:
            this.n5(36);
            break;
         case 4:
            this.n5(95);
            break;
         case 5:
            this.a2();
            this.n5(117);
            this.g8();
            this.g8();
            this.g8();
            this.g8();
      }
   }

   public final void s2() throws w1 {
      byte var1 = 3;
      switch (this.l6.n5(1)) {
         case 36:
         case 65:
         case 66:
         case 67:
         case 68:
         case 69:
         case 70:
         case 71:
         case 72:
         case 73:
         case 74:
         case 75:
         case 76:
         case 77:
         case 78:
         case 79:
         case 80:
         case 81:
         case 82:
         case 83:
         case 84:
         case 85:
         case 86:
         case 87:
         case 88:
         case 89:
         case 90:
         case 92:
         case 95:
         case 97:
         case 98:
         case 99:
         case 100:
         case 101:
         case 102:
         case 103:
         case 104:
         case 105:
         case 106:
         case 107:
         case 108:
         case 109:
         case 110:
         case 111:
         case 112:
         case 113:
         case 114:
         case 115:
         case 116:
         case 117:
         case 118:
         case 119:
         case 120:
         case 121:
         case 122:
            var1 = 2;
            break;
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 47:
         case 58:
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         case 64:
         case 91:
         case 93:
         case 94:
         case 96:
         default:
            var1 = 3;
            break;
         case 48:
         case 49:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
            var1 = 1;
      }

      switch (var1) {
         case 1:
            this.p9();
            break;
         case 2:
            this.f8();
            break;
         case 3:
            if (!this.k5(this.l6.n5(1))) {
               throw new y4(this.l6, "IdentifierPart", " isIdentifierPartUnicode(input.LA(1)) ");
            }

            this.s7();
      }
   }

   public final void n2() throws w1 {
      this.f8();

      while (true) {
         byte var1 = 2;
         int var2 = this.l6.n5(1);
         if (var2 != 36 && (var2 < 48 || var2 > 57) && (var2 < 65 || var2 > 90) && var2 != 92 && var2 != 95 && (var2 < 97 || var2 > 122)) {
            if (this.k5(this.l6.n5(1))) {
               var1 = 1;
            }
         } else {
            var1 = 1;
         }

         switch (var1) {
            case 1:
               this.s2();
               break;
            default:
               return;
         }
      }
   }

   public final void l0() throws w1 {
      byte var1 = 2;
      int var2 = this.l6.n5(1);
      if (var2 != 36 && (var2 < 65 || var2 > 90) && var2 != 92 && var2 != 95 && (var2 < 97 || var2 > 122)) {
         var1 = 2;
      } else {
         var1 = 1;
      }

      switch (var1) {
         case 1:
            this.n2();
            break;
         case 2:
            this.k2();
      }

      this.n5.e2 = 148;
      this.n5.y4 = 0;
   }

   public final void p9() throws w1 {
      this.n5(48, 57);
   }

   public final void g8() throws w1 {
      if ((this.l6.n5(1) < 48 || this.l6.n5(1) > 57) && (this.l6.n5(1) < 65 || this.l6.n5(1) > 70) && (this.l6.n5(1) < 97 || this.l6.n5(1) > 102)) {
         q0 var1 = new q0(null, this.l6);
         this.k5(var1);
         throw var1;
      }

      this.l6.n5();
   }

   public final void i0() throws w1 {
      this.n5(48, 55);
   }

   public final void b4() throws w1 {
      if (this.l6.n5(1) != 69 && this.l6.n5(1) != 101) {
         q0 var6 = new q0(null, this.l6);
         this.k5(var6);
         throw var6;
      }

      this.l6.n5();
      byte var1 = 2;
      int var2 = this.l6.n5(1);
      if (var2 == 43 || var2 == 45) {
         var1 = 1;
      }

      switch (var1) {
         case 1:
            if (this.l6.n5(1) != 43 && this.l6.n5(1) != 45) {
               q0 var7 = new q0(null, this.l6);
               this.k5(var7);
               throw var7;
            } else {
               this.l6.n5();
            }
         default:
            int var3 = 0;

            while (true) {
               byte var4 = 2;
               int var5 = this.l6.n5(1);
               if (var5 >= 48 && var5 <= 57) {
                  var4 = 1;
               }

               switch (var4) {
                  case 1:
                     this.p9();
                     var3++;
                     break;
                  default:
                     if (var3 >= 1) {
                        return;
                     }

                     throw new n3(10, this.l6);
               }
            }
      }
   }

   public final void x5() throws w1 {
      byte var1 = 2;
      int var2 = this.l6.n5(1);
      if (var2 == 48) {
         var1 = 1;
      } else {
         if (var2 < 49 || var2 > 57) {
            throw new m3("", 12, 0, this.l6);
         }

         var1 = 2;
      }

      switch (var1) {
         case 1:
            this.n5(48);
            break;
         case 2:
            this.n5(49, 57);

            while (true) {
               byte var3 = 2;
               int var4 = this.l6.n5(1);
               if (var4 >= 48 && var4 <= 57) {
                  var3 = 1;
               }

               switch (var3) {
                  case 1:
                     this.p9();
                     break;
                  default:
                     return;
               }
            }
      }
   }

   public final void i8() throws w1 {
      int var1 = 3;
      var1 = this.k5.n5(this.l6);
      label82:
      switch (var1) {
         case 1:
            this.x5();
            this.n5(46);

            while (true) {
               byte var7 = 2;
               int var11 = this.l6.n5(1);
               if (var11 >= 48 && var11 <= 57) {
                  var7 = 1;
               }

               switch (var7) {
                  case 1:
                     this.p9();
                     break;
                  default:
                     var7 = 2;
                     var11 = this.l6.n5(1);
                     if (var11 == 69 || var11 == 101) {
                        var7 = 1;
                     }

                     switch (var7) {
                        case 1:
                           this.b4();
                        default:
                           break label82;
                     }
               }
            }
         case 2:
            this.n5(46);
            int var6 = 0;

            while (true) {
               byte var9 = 2;
               int var4 = this.l6.n5(1);
               if (var4 >= 48 && var4 <= 57) {
                  var9 = 1;
               }

               switch (var9) {
                  case 1:
                     this.p9();
                     var6++;
                     break;
                  default:
                     if (var6 < 1) {
                        throw new n3(15, this.l6);
                     }

                     var9 = 2;
                     var4 = this.l6.n5(1);
                     if (var4 == 69 || var4 == 101) {
                        var9 = 1;
                     }

                     switch (var9) {
                        case 1:
                           this.b4();
                        default:
                           break label82;
                     }
               }
            }
         case 3:
            this.x5();
            byte var2 = 2;
            int var3 = this.l6.n5(1);
            if (var3 == 69 || var3 == 101) {
               var2 = 1;
            }

            switch (var2) {
               case 1:
                  this.b4();
            }
      }

      this.n5.e2 = 159;
      this.n5.y4 = 0;
   }

   public final void a4() throws w1 {
      this.n5(48);
      int var1 = 0;

      while (true) {
         byte var2 = 2;
         int var3 = this.l6.n5(1);
         if (var3 >= 48 && var3 <= 55) {
            var2 = 1;
         }

         switch (var2) {
            case 1:
               this.i0();
               var1++;
               break;
            default:
               if (var1 >= 1) {
                  this.n5.e2 = 160;
                  this.n5.y4 = 0;
                  return;
               }

               throw new n3(19, this.l6);
         }
      }
   }

   public final void x3() throws w1 {
      byte var1 = 2;
      int var2 = this.l6.n5(1);
      if (var2 != 48) {
         throw new m3("", 20, 0, this.l6);
      }

      int var3 = this.l6.n5(2);
      if (var3 == 120) {
         var1 = 1;
      } else {
         if (var3 != 88) {
            throw new m3("", 20, 1, this.l6);
         }

         var1 = 2;
      }

      switch (var1) {
         case 1:
            this.l6("0x");
            break;
         case 2:
            this.l6("0X");
      }

      var3 = 0;

      while (true) {
         byte var4 = 2;
         int var5 = this.l6.n5(1);
         if (var5 >= 48 && var5 <= 57 || var5 >= 65 && var5 <= 70 || var5 >= 97 && var5 <= 102) {
            var4 = 1;
         }

         switch (var4) {
            case 1:
               this.g8();
               var3++;
               break;
            default:
               if (var3 >= 1) {
                  this.n5.e2 = 161;
                  this.n5.y4 = 0;
                  return;
               }

               throw new n3(21, this.l6);
         }
      }
   }

   public final void b2() throws w1 {
      if ((this.l6.n5(1) < 0 || this.l6.n5(1) > 9)
         && (this.l6.n5(1) < 11 || this.l6.n5(1) > 12)
         && (this.l6.n5(1) < 14 || this.l6.n5(1) > 47)
         && (this.l6.n5(1) < 58 || this.l6.n5(1) > 116)
         && (this.l6.n5(1) < 118 || this.l6.n5(1) > 119)
         && (this.l6.n5(1) < 121 || this.l6.n5(1) > 8231)
         && (this.l6.n5(1) < 8234 || this.l6.n5(1) > 65535)) {
         q0 var1 = new q0(null, this.l6);
         this.k5(var1);
         throw var1;
      }

      this.l6.n5();
   }

   public final void m4() throws w1 {
      this.n5(48, 51);
   }

   public final void b1() throws w1 {
      byte var1 = 4;
      int var2 = this.l6.n5(1);
      if (var2 >= 48 && var2 <= 51) {
         int var6 = this.l6.n5(2);
         if (var6 >= 48 && var6 <= 55) {
            int var4 = this.l6.n5(3);
            if (var4 >= 48 && var4 <= 55) {
               var1 = 4;
            } else {
               var1 = 2;
            }
         } else {
            var1 = 1;
         }
      } else {
         if (var2 < 52 || var2 > 55) {
            throw new m3("", 22, 0, this.l6);
         }

         int var3 = this.l6.n5(2);
         if (var3 >= 48 && var3 <= 55) {
            var1 = 3;
         } else {
            var1 = 1;
         }
      }

      switch (var1) {
         case 1:
            this.i0();
            break;
         case 2:
            this.m4();
            this.i0();
            break;
         case 3:
            this.n5(52, 55);
            this.i0();
            break;
         case 4:
            this.m4();
            this.i0();
            this.i0();
      }
   }

   public final void j1() throws w1 {
      this.n5(120);
      this.g8();
      this.g8();
   }

   public final void k6() throws w1 {
      this.n5(117);
      this.g8();
      this.g8();
      this.g8();
      this.g8();
   }

   public final void o7() throws w1 {
      this.a2();
      byte var1 = 5;
      int var2 = this.l6.n5(1);
      if ((var2 < 0 || var2 > 9)
         && (var2 < 11 || var2 > 12)
         && (var2 < 14 || var2 > 47)
         && (var2 < 58 || var2 > 116)
         && (var2 < 118 || var2 > 119)
         && (var2 < 121 || var2 > 8231)
         && (var2 < 8234 || var2 > 65535)) {
         if (var2 >= 48 && var2 <= 55) {
            var1 = 2;
         } else if (var2 == 120) {
            var1 = 3;
         } else if (var2 == 117) {
            var1 = 4;
         } else {
            if (var2 != 10 && var2 != 13) {
               throw new m3("", 24, 0, this.l6);
            }

            var1 = 5;
         }
      } else {
         var1 = 1;
      }

      switch (var1) {
         case 1:
            this.b2();
            break;
         case 2:
            this.b1();
            break;
         case 3:
            this.j1();
            break;
         case 4:
            this.k6();
            break;
         case 5:
            byte var3 = 2;
            int var4 = this.l6.n5(1);
            if (var4 == 13) {
               var3 = 1;
            }

            switch (var3) {
               case 1:
                  this.o2();
               default:
                  this.x0();
            }
      }
   }

   public final void v9() throws w1 {
      byte var1 = 2;
      int var2 = this.l6.n5(1);
      if (var2 == 39) {
         var1 = 1;
      } else {
         if (var2 != 34) {
            throw new m3("", 27, 0, this.l6);
         }

         var1 = 2;
      }

      label185:
      switch (var1) {
         case 1:
            this.t6();

            while (true) {
               byte var7 = 3;
               int var8 = this.l6.n5(1);
               if ((var8 < 0 || var8 > 9)
                  && (var8 < 11 || var8 > 12)
                  && (var8 < 14 || var8 > 38)
                  && (var8 < 40 || var8 > 91)
                  && (var8 < 93 || var8 > 8231)
                  && (var8 < 8234 || var8 > 65535)) {
                  if (var8 == 92) {
                     var7 = 2;
                  }
               } else {
                  var7 = 1;
               }

               switch (var7) {
                  case 1:
                     if ((this.l6.n5(1) < 0 || this.l6.n5(1) > 9)
                        && (this.l6.n5(1) < 11 || this.l6.n5(1) > 12)
                        && (this.l6.n5(1) < 14 || this.l6.n5(1) > 38)
                        && (this.l6.n5(1) < 40 || this.l6.n5(1) > 91)
                        && (this.l6.n5(1) < 93 || this.l6.n5(1) > 8231)
                        && (this.l6.n5(1) < 8234 || this.l6.n5(1) > 65535)) {
                        q0 var9 = new q0(null, this.l6);
                        this.k5(var9);
                        throw var9;
                     }

                     this.l6.n5();
                     break;
                  case 2:
                     this.o7();
                     break;
                  default:
                     this.t6();
                     break label185;
               }
            }
         case 2:
            this.h1();

            label133:
            while (true) {
               byte var3 = 3;
               int var4 = this.l6.n5(1);
               if ((var4 < 0 || var4 > 9)
                  && (var4 < 11 || var4 > 12)
                  && (var4 < 14 || var4 > 33)
                  && (var4 < 35 || var4 > 91)
                  && (var4 < 93 || var4 > 8231)
                  && (var4 < 8234 || var4 > 65535)) {
                  if (var4 == 92) {
                     var3 = 2;
                  }
               } else {
                  var3 = 1;
               }

               switch (var3) {
                  case 1:
                     if ((this.l6.n5(1) < 0 || this.l6.n5(1) > 9)
                        && (this.l6.n5(1) < 11 || this.l6.n5(1) > 12)
                        && (this.l6.n5(1) < 14 || this.l6.n5(1) > 33)
                        && (this.l6.n5(1) < 35 || this.l6.n5(1) > 91)
                        && (this.l6.n5(1) < 93 || this.l6.n5(1) > 8231)
                        && (this.l6.n5(1) < 8234 || this.l6.n5(1) > 65535)) {
                        q0 var5 = new q0(null, this.l6);
                        this.k5(var5);
                        throw var5;
                     }

                     this.l6.n5();
                     break;
                  case 2:
                     this.o7();
                     break;
                  default:
                     this.h1();
                     break label133;
               }
            }
      }

      this.n5.e2 = 149;
      this.n5.y4 = 0;
   }

   public final void r9() throws w1 {
      this.a2();
      if ((this.l6.n5(1) < 0 || this.l6.n5(1) > 9)
         && (this.l6.n5(1) < 11 || this.l6.n5(1) > 12)
         && (this.l6.n5(1) < 14 || this.l6.n5(1) > 8231)
         && (this.l6.n5(1) < 8234 || this.l6.n5(1) > 65535)) {
         q0 var1 = new q0(null, this.l6);
         this.k5(var1);
         throw var1;
      }

      this.l6.n5();
   }

   public final void c7() throws w1 {
      byte var1 = 2;
      int var2 = this.l6.n5(1);
      if ((var2 < 0 || var2 > 9)
         && (var2 < 11 || var2 > 12)
         && (var2 < 14 || var2 > 41)
         && (var2 < 43 || var2 > 46)
         && (var2 < 48 || var2 > 91)
         && (var2 < 93 || var2 > 8231)
         && (var2 < 8234 || var2 > 65535)) {
         if (var2 != 92) {
            throw new m3("", 28, 0, this.l6);
         }

         var1 = 2;
      } else {
         var1 = 1;
      }

      switch (var1) {
         case 1:
            if ((this.l6.n5(1) < 0 || this.l6.n5(1) > 9)
               && (this.l6.n5(1) < 11 || this.l6.n5(1) > 12)
               && (this.l6.n5(1) < 14 || this.l6.n5(1) > 41)
               && (this.l6.n5(1) < 43 || this.l6.n5(1) > 46)
               && (this.l6.n5(1) < 48 || this.l6.n5(1) > 91)
               && (this.l6.n5(1) < 93 || this.l6.n5(1) > 8231)
               && (this.l6.n5(1) < 8234 || this.l6.n5(1) > 65535)) {
               q0 var3 = new q0(null, this.l6);
               this.k5(var3);
               throw var3;
            }

            this.l6.n5();
            break;
         case 2:
            this.r9();
      }
   }

   public final void w4() throws w1 {
      byte var1 = 2;
      int var2 = this.l6.n5(1);
      if ((var2 < 0 || var2 > 9)
         && (var2 < 11 || var2 > 12)
         && (var2 < 14 || var2 > 46)
         && (var2 < 48 || var2 > 91)
         && (var2 < 93 || var2 > 8231)
         && (var2 < 8234 || var2 > 65535)) {
         if (var2 != 92) {
            throw new m3("", 29, 0, this.l6);
         }

         var1 = 2;
      } else {
         var1 = 1;
      }

      switch (var1) {
         case 1:
            if ((this.l6.n5(1) < 0 || this.l6.n5(1) > 9)
               && (this.l6.n5(1) < 11 || this.l6.n5(1) > 12)
               && (this.l6.n5(1) < 14 || this.l6.n5(1) > 46)
               && (this.l6.n5(1) < 48 || this.l6.n5(1) > 91)
               && (this.l6.n5(1) < 93 || this.l6.n5(1) > 8231)
               && (this.l6.n5(1) < 8234 || this.l6.n5(1) > 65535)) {
               q0 var3 = new q0(null, this.l6);
               this.k5(var3);
               throw var3;
            }

            this.l6.n5();
            break;
         case 2:
            this.r9();
      }
   }

   public final void n0() throws w1 {
      if (!this.f1()) {
         throw new y4(this.l6, "RegularExpressionLiteral", " areRegularExpressionsEnabled() ");
      }

      this.r7();
      this.c7();

      while (true) {
         byte var1 = 2;
         int var2 = this.l6.n5(1);
         if (var2 >= 0 && var2 <= 9 || var2 >= 11 && var2 <= 12 || var2 >= 14 && var2 <= 46 || var2 >= 48 && var2 <= 8231 || var2 >= 8234 && var2 <= 65535) {
            var1 = 1;
         }

         switch (var1) {
            case 1:
               this.w4();
               break;
            default:
               this.r7();

               while (true) {
                  var1 = 2;
                  var2 = this.l6.n5(1);
                  if (var2 != 36 && (var2 < 48 || var2 > 57) && (var2 < 65 || var2 > 90) && var2 != 92 && var2 != 95 && (var2 < 97 || var2 > 122)) {
                     if (this.k5(this.l6.n5(1))) {
                        var1 = 1;
                     }
                  } else {
                     var1 = 1;
                  }

                  switch (var1) {
                     case 1:
                        this.s2();
                        break;
                     default:
                        this.n5.e2 = 155;
                        this.n5.y4 = 0;
                        return;
                  }
               }
         }
      }
   }

   @Override
   public void c8() throws w1 {
      int var1 = 117;
      var1 = this.u3.n5(this.l6);
      switch (var1) {
         case 1:
            this.n3();
            break;
         case 2:
            this.y4();
            break;
         case 3:
            this.e2();
            break;
         case 4:
            this.t9();
            break;
         case 5:
            this.z1();
            break;
         case 6:
            this.t4();
            break;
         case 7:
            this.q0();
            break;
         case 8:
            this.z3();
            break;
         case 9:
            this.m1();
            break;
         case 10:
            this.k7();
            break;
         case 11:
            this.m3();
            break;
         case 12:
            this.z8();
            break;
         case 13:
            this.j5();
            break;
         case 14:
            this.w1();
            break;
         case 15:
            this.r4();
            break;
         case 16:
            this.c4();
            break;
         case 17:
            this.y2();
            break;
         case 18:
            this.y1();
            break;
         case 19:
            this.a0();
            break;
         case 20:
            this.d2();
            break;
         case 21:
            this.d5();
            break;
         case 22:
            this.s3();
            break;
         case 23:
            this.p8();
            break;
         case 24:
            this.f2();
            break;
         case 25:
            this.i1();
            break;
         case 26:
            this.e5();
            break;
         case 27:
            this.b3();
            break;
         case 28:
            this.o0();
            break;
         case 29:
            this.z7();
            break;
         case 30:
            this.v4();
            break;
         case 31:
            this.u6();
            break;
         case 32:
            this.t1();
            break;
         case 33:
            this.a5();
            break;
         case 34:
            this.h2();
            break;
         case 35:
            this.v0();
            break;
         case 36:
            this.f0();
            break;
         case 37:
            this.a3();
            break;
         case 38:
            this.p3();
            break;
         case 39:
            this.x9();
            break;
         case 40:
            this.y0();
            break;
         case 41:
            this.j9();
            break;
         case 42:
            this.z6();
            break;
         case 43:
            this.e9();
            break;
         case 44:
            this.o5();
            break;
         case 45:
            this.j8();
            break;
         case 46:
            this.w2();
            break;
         case 47:
            this.s0();
            break;
         case 48:
            this.v8();
            break;
         case 49:
            this.v3();
            break;
         case 50:
            this.g7();
            break;
         case 51:
            this.j4();
            break;
         case 52:
            this.i9();
            break;
         case 53:
            this.f5();
            break;
         case 54:
            this.j3();
            break;
         case 55:
            this.n1();
            break;
         case 56:
            this.p6();
            break;
         case 57:
            this.d1();
            break;
         case 58:
            this.s4();
            break;
         case 59:
            this.h6();
            break;
         case 60:
            this.y8();
            break;
         case 61:
            this.c3();
            break;
         case 62:
            this.l4();
            break;
         case 63:
            this.i6();
            break;
         case 64:
            this.a7();
            break;
         case 65:
            this.r8();
            break;
         case 66:
            this.r1();
            break;
         case 67:
            this.y5();
            break;
         case 68:
            this.k8();
            break;
         case 69:
            this.b5();
            break;
         case 70:
            this.u8();
            break;
         case 71:
            this.w5();
            break;
         case 72:
            this.q1();
            break;
         case 73:
            this.u5();
            break;
         case 74:
            this.w8();
            break;
         case 75:
            this.c2();
            break;
         case 76:
            this.t3();
            break;
         case 77:
            this.u4();
            break;
         case 78:
            this.s9();
            break;
         case 79:
            this.p7();
            break;
         case 80:
            this.z5();
            break;
         case 81:
            this.h5();
            break;
         case 82:
            this.a8();
            break;
         case 83:
            this.f4();
            break;
         case 84:
            this.y9();
            break;
         case 85:
            this.a1();
            break;
         case 86:
            this.w3();
            break;
         case 87:
            this.i4();
            break;
         case 88:
            this.q3();
            break;
         case 89:
            this.q2();
            break;
         case 90:
            this.p4();
            break;
         case 91:
            this.d6();
            break;
         case 92:
            this.y6();
            break;
         case 93:
            this.n7();
            break;
         case 94:
            this.l5();
            break;
         case 95:
            this.u2();
            break;
         case 96:
            this.d9();
            break;
         case 97:
            this.c5();
            break;
         case 98:
            this.t5();
            break;
         case 99:
            this.j6();
            break;
         case 100:
            this.w9();
            break;
         case 101:
            this.m8();
            break;
         case 102:
            this.b9();
            break;
         case 103:
            this.r6();
            break;
         case 104:
            this.r5();
            break;
         case 105:
            this.h9();
            break;
         case 106:
            this.r7();
            break;
         case 107:
            this.n9();
            break;
         case 108:
            this.v6();
            break;
         case 109:
            this.x7();
            break;
         case 110:
            this.z0();
            break;
         case 111:
            this.z9();
            break;
         case 112:
            this.l0();
            break;
         case 113:
            this.i8();
            break;
         case 114:
            this.a4();
            break;
         case 115:
            this.x3();
            break;
         case 116:
            this.v9();
            break;
         case 117:
            this.n0();
      }
   }

   // $VF: synthetic method
   static boolean n5(n5 var0) {
      return var0.f1();
   }

   static {
      int var0 = a6.length;
      n3 = new short[var0][];

      for (int var1 = 0; var1 < var0; var1++) {
         n3[var1] = com.aspose.slides.internal.n5.x8.n5(a6[var1]);
      }

      y4 = new String[]{
         "\u0001)\u0001*\u0002)\u0001*\u0012\uffff\u0001)\u0001\u001d\u0001.\u0002\uffff\u0001!\u0001\"\u0001.\u0001\u0013\u0001\u0014\u0001 \u0001\u001e\u0001\u0019\u0001\u001f\u0001\u0017\u0001(\u0001,\t-\u0001'\u0001\u0018\u0001\u001a\u0001\u001c\u0001\u001b\u0001&\u001b\uffff\u0001\u0015\u0001\uffff\u0001\u0016\u0001$\u0002\uffff\u0001\r\u0001\u0004\u0001\u0005\u0001\u0006\u0001\u0007\u0001\u0003\u0001\u000e\u0001\uffff\u0001\b\u0002\uffff\u0001\u000f\u0001\uffff\u0001\u0001\u0001\uffff\u0001\u0010\u0001\uffff\u0001\t\u0001\n\u0001\u0002\u0001\uffff\u0001\u000b\u0001\f\u0003\uffff\u0001\u0011\u0001#\u0001\u0012\u0001%!\uffff\u0001)ᗟ\uffff\u0001)ƍ\uffff\u0001)߱\uffff\u000b)\u001d\uffff\u0002*\u0005\uffff\u0001)/\uffff\u0001)ྠ\uffff\u0001)",
         "\u00011\u0003\uffff\u00010\u000f\uffff\u0001/",
         "\u00013\t\uffff\u00012\u0006\uffff\u00014",
         "\u00015\u0007\uffff\u00016\u0002\uffff\u00019\u0002\uffff\u00017\u0005\uffff\u00018",
         "\u0001;\u0002\uffff\u0001:\u0006\uffff\u0001<",
         "\u0001=\u0006\uffff\u0001?\u0003\uffff\u0001@\u0002\uffff\u0001>",
         "\u0001A\t\uffff\u0001B",
         "\u0001C\u0001\uffff\u0001D\t\uffff\u0001E",
         "\u0001F\u0006\uffff\u0001H\u0001G",
         "\u0001I",
         "\u0001K\u000b\uffff\u0001L\u0001M\u0001\uffff\u0001J\u0001\uffff\u0001N",
         "\u0001O\r\uffff\u0001P",
         "\u0001Q\u0001R",
         "\u0001S",
         "\u0001T",
         "\u0001U",
         "\u0001V\u0010\uffff\u0001W\u0002\uffff\u0001X",
         "",
         "",
         "",
         "",
         "",
         "",
         "\n-",
         "",
         "",
         "\u0001[\u0001Z",
         "\u0001]\u0001^",
         "\u0001`",
         "\u0001b",
         "\u0001d\u0011\uffff\u0001e",
         "\u0001g\u000f\uffff\u0001h",
         "\u0001j",
         "\u0001l",
         "\u0001n\u0016\uffff\u0001o",
         "\u0001r>\uffff\u0001q",
         "\u0001t",
         "",
         "",
         "",
         "\nz\u0001\uffff\u0002z\u0001\uffff\u001cz\u0001w\u0004z\u0001x\rz\u0001vῪz\u0002\uffff\udfd6z",
         "",
         "",
         "",
         "\b| \uffff\u0001{\u001f\uffff\u0001{",
         "",
         "",
         "\u0001}",
         "\u0001~",
         "\u0001\u007f",
         "\u0001\u0082\u0013\uffff\u0001\u0080\u0003\uffff\u0001\u0081",
         "\u0001\u0083\b\uffff\u0001\u0084",
         "\u0001\u0085",
         "\u0001\u0086",
         "\u0001\u0087",
         "\u0001\u0088",
         "\u0001\u0089",
         "\u0001\u008a",
         "\u0001\u008b",
         "\u0001\u008c",
         "\u0001\u008d",
         "\u0001\u008e\u0001\u008f",
         "\u0001\u0090",
         "\u0001\u0091",
         "\u0001\u0092",
         "\u0001\u0095\u0003\uffff\u0001\u0093\u0005\uffff\u0001\u0094",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u0014+\u0001\u0096\u0005+",
         "\u0001\u0098",
         "\u0001\u0099",
         "\u0001\u009a\u0003\uffff\u0001\u009b",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u0012+\u0001\u009d\u0001\u009e\u0006+",
         "\u0001 ",
         "\u0001¡",
         "\u0001¢",
         "\u0001£",
         "\u0001¤",
         "\u0001¥",
         "\u0001¦",
         "\u0001§",
         "\u0001¨\u0002\uffff\u0001©",
         "\u0001ª",
         "\u0001«",
         "\u0001¬",
         "\u0001\u00ad",
         "\u0001®",
         "\u0001¯",
         "\u0001°\u0005\uffff\u0001±",
         "\u0001²",
         "",
         "",
         "\u0001³",
         "",
         "",
         "\u0001¶\u0001µ",
         "",
         "\u0001¸",
         "",
         "\u0001º",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "\nz\u0001\uffff\u0002z\u0001\uffff‚z\u0002\uffff\udfd6z",
         "",
         "",
         "",
         "",
         "",
         "",
         "\u0001½",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001¿",
         "\u0001À",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001Â",
         "\u0001Ã",
         "\u0001Ä",
         "\u0001Å",
         "\u0001Æ",
         "\u0001Ç",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001É",
         "\u0001Ê",
         "\u0001Ë",
         "\u0001Ì",
         "\u0001Í",
         "\u0001Î",
         "\u0001Ï",
         "\u0001Ñ\u0001Ð",
         "\u0001Ò",
         "\u0001Ó",
         "\u0001Ô",
         "\u0001Õ",
         "\u0001Ö",
         "\u0001×",
         "",
         "\u0001Ø",
         "\u0001Ù",
         "\u0001Ú",
         "\u0001Û",
         "",
         "\u0001Ü",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u0004+\u0001Ý\u0015+",
         "",
         "\u0001ß\u0002\uffff\u0001à",
         "\u0001á",
         "\u0001â",
         "\u0001ã",
         "\u0001ä",
         "\u0001å",
         "\u0001æ",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001è",
         "\u0001é",
         "\u0001ê",
         "\u0001ë",
         "\u0001ì",
         "\u0001í",
         "\u0001î",
         "\u0001ï",
         "\u0001ð",
         "\u0001ñ",
         "\u0001ò",
         "",
         "",
         "\u0001ó",
         "",
         "",
         "",
         "",
         "",
         "",
         "",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "",
         "\u0001ö",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "",
         "\u0001ø",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001ú",
         "\u0001û",
         "\u0001ü",
         "\u0001ý",
         "",
         "\u0001þ",
         "\u0001ÿ",
         "\u0001Ā",
         "\u0001ā",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001Ą",
         "\u0001ą",
         "\u0001Ć",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001Ĉ",
         "\u0001ĉ",
         "\u0001Ċ",
         "\u0001ċ",
         "\u0001Č",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001ď",
         "\u0001Đ",
         "\u0001đ",
         "\u0001Ē",
         "",
         "\u0001ē",
         "\u0001Ĕ",
         "\u0001ĕ",
         "\u0001Ė",
         "\u0001ė",
         "\u0001Ę",
         "\u0001ę",
         "\u0001Ě",
         "",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001Ĝ",
         "\u0001ĝ",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001ğ",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001Ģ",
         "\u0001ģ",
         "\u0001Ĥ",
         "\u0001ĥ",
         "",
         "",
         "",
         "\u0001Ħ",
         "",
         "\u0001ħ",
         "",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u0012+\u0001Ĩ\u0007+",
         "\u0001Ī",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u000b+\u0001Ĭ\u000e+",
         "\u0001Į",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001ı",
         "",
         "",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001ĳ",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001Ķ",
         "\u0001ķ",
         "\u0001ĸ",
         "\u0001Ĺ",
         "",
         "",
         "\u0001ĺ",
         "\u0001Ļ",
         "\u0001ļ",
         "\u0001Ľ",
         "\u0001ľ",
         "\u0001Ŀ",
         "\u0001ŀ",
         "\u0001Ł",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001Ń",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001Ņ",
         "",
         "\u0001ņ",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "",
         "\u0001ň",
         "",
         "",
         "\u0001ŉ",
         "\u0001Ŋ",
         "\u0001ŋ",
         "\u0001Ō",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001Ŏ",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "",
         "\u0001ő",
         "",
         "\u0001Œ",
         "",
         "",
         "\u0001œ",
         "",
         "\u0001Ŕ",
         "",
         "",
         "\u0001ŕ",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001ŗ",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001Ś",
         "\u0001ś",
         "\u0001Ŝ",
         "\u0001ŝ",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "",
         "\u0001Ţ",
         "\u0001ţ",
         "",
         "\u0001Ť",
         "\u0001ť",
         "\u0001Ŧ",
         "\u0001ŧ",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "",
         "\u0001ũ",
         "",
         "",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001ū",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001ŭ",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "",
         "\u0001ů",
         "",
         "",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001ű",
         "\u0001Ų",
         "\u0001ų",
         "",
         "",
         "",
         "",
         "\u0001Ŵ",
         "\u0001ŵ",
         "\u0001Ŷ",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001Ź",
         "",
         "\u0001ź",
         "",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "",
         "\u0001ž",
         "\u0001ſ",
         "\u0001ƀ",
         "\u0001Ɓ",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "",
         "",
         "\u0001Ƅ",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "",
         "",
         "",
         "\u0001Ɔ",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001ƈ",
         "\u0001Ɖ",
         "",
         "",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         "\u0001ƍ",
         "",
         "",
         "",
         "\u0001Ǝ",
         "\u0001+\u000b\uffff\n+\u0007\uffff\u001a+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u001a+",
         ""
      };
      e2 = com.aspose.slides.internal.n5.x8.n5(
         "\u0011+\u0006\uffff\u0001Y\u0002\uffff\u0001\\\u0001_\u0001a\u0001c\u0001f\u0001i\u0001k\u0001m\u0001p\u0001s\u0001u\u0003\uffff\u0001y\u0003\uffff\u0001-\u0002\uffff\u0013+\u0001\u0097\u0003+\u0001\u009c\u0001\u009f\u0011+\u0002\uffff\u0001´\u0002\uffff\u0001·\u0001\uffff\u0001¹\u0001\uffff\u0001»\u0013\uffff\u0001¼\u0006\uffff\u0001+\u0001¾\u0002+\u0001Á\u0006+\u0001È\u000e+\u0001\uffff\u0004+\u0001\uffff\u0001+\u0001Þ\u0001\uffff\u0007+\u0001ç\u000b+\u0002\uffff\u0001ô\u0007\uffff\u0001õ\u0001\uffff\u0001+\u0001÷\u0001\uffff\u0001+\u0001ù\u0004+\u0001\uffff\u0004+\u0001Ă\u0001ă\u0003+\u0001ć\u0005+\u0001č\u0001Ď\u0004+\u0001\uffff\b+\u0001\uffff\u0001ě\u0002+\u0001Ğ\u0001+\u0001Ġ\u0001ġ\u0004+\u0003\uffff\u0001+\u0001\uffff\u0001+\u0001\uffff\u0001ĩ\u0001+\u0001ī\u0001ĭ\u0001+\u0001į\u0001İ\u0001+\u0002\uffff\u0001Ĳ\u0001+\u0001Ĵ\u0001\uffff\u0001ĵ\u0004+\u0002\uffff\b+\u0001ł\u0001+\u0001ń\u0001+\u0001\uffff\u0001+\u0001Ň\u0001\uffff\u0001+\u0002\uffff\u0004+\u0001ō\u0001+\u0001ŏ\u0001\uffff\u0001Ő\u0001\uffff\u0001+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001\uffff\u0001+\u0002\uffff\u0001+\u0001Ŗ\u0001+\u0001Ř\u0001ř\u0004+\u0001Ş\u0001ş\u0001Š\u0001\uffff\u0001š\u0001\uffff\u0002+\u0001\uffff\u0004+\u0001Ũ\u0001\uffff\u0001+\u0002\uffff\u0001Ū\u0001+\u0001Ŭ\u0001+\u0001Ů\u0001\uffff\u0001+\u0002\uffff\u0001Ű\u0003+\u0004\uffff\u0003+\u0001ŷ\u0001Ÿ\u0001+\u0001\uffff\u0001+\u0001\uffff\u0001Ż\u0001\uffff\u0001ż\u0001\uffff\u0001Ž\u0001\uffff\u0004+\u0001Ƃ\u0001ƃ\u0002\uffff\u0001+\u0001ƅ\u0003\uffff\u0001+\u0001Ƈ\u0002+\u0002\uffff\u0001Ɗ\u0001\uffff\u0001Ƌ\u0001\uffff\u0001ƌ\u0001+\u0003\uffff\u0001+\u0001Ə\u0001\uffff"
      );
      t9 = com.aspose.slides.internal.n5.x8.n5("Ɛ\uffff");
      z1 = com.aspose.slides.internal.n5.x8.l6(
         "\u0001\t\u0001a\u0001h\u0001a\u0001o\u0001a\u0001e\u0001l\u0001f\u0001e\u0001h\u0001a\u0001h\u0001b\u0002o\u0001a\u0006\uffff\u00010\u0002\uffff\u0001<\u0003=\u0001+\u0001-\u0002=\u0001&\u0002=\u0003\uffff\u0001\u0000\u0003\uffff\u00010\u0002\uffff\u0001l\u0001w\u0001t\u0001a\u0001i\u0001p\u0001l\u0001n\u0001r\u0001n\u0001o\u0001e\u0001o\u0001t\u0001s\u0001n\u0002a\u0001b\u0001$\u0001s\u0001u\u0001p\u0002$\u0001p\u0001t\u0001i\u0001o\u0001a\u0001p\u0001n\u0001r\u0002i\u0001t\u0001s\u0001t\u0001n\u0001c\u0001i\u0001b\u0002\uffff\u0001=\u0002\uffff\u0001=\u0001\uffff\u0001=\u0001\uffff\u0001=\u0013\uffff\u0001\u0000\u0006\uffff\u0001l\u0001$\u0001i\u0001e\u0001$\u0001n\u0001s\u0001o\u0001e\u0001s\u0001a\u0001$\u0001c\u0002a\u0001l\u0002e\u0001c\u0001s\u0001r\u0001s\u0001a\u0001e\u0001u\u0001b\u0001\uffff\u0001e\u0001m\u0001o\u0001e\u0001\uffff\u0001t\u0001$\u0001\uffff\u0001l\u0001u\u0001t\u0001r\u0001t\u0001e\u0001c\u0001$\u0001d\u0001a\u0001l\u0001h\u0001t\u0001o\u0001g\u0001k\u0001v\u0001t\u0001l\u0002\uffff\u0001=\u0007\uffff\u0001$\u0001\uffff\u0001v\u0001$\u0001\uffff\u0001s\u0001$\u0001w\u0001o\u0001e\u0001l\u0001\uffff\u0002t\u0001k\u0001e\u0002$\u0001h\u0001i\u0001t\u0001$\u0001s\u0001u\u0001t\u0001g\u0001l\u0002$\u0001r\u0001n\u0001a\u0001r\u0001\uffff\u0001e\u0002r\u0001c\u0001t\u0001i\u0001r\u0001h\u0001\uffff\u0001$\u0001t\u0001e\u0001$\u0001r\u0002$\u0002a\u0001e\u0001i\u0003\uffff\u0001e\u0001\uffff\u0001i\u0001\uffff\u0001$\u0001f\u0002$\u0001i\u0002$\u0001a\u0002\uffff\u0001$\u0001n\u0001$\u0001\uffff\u0001$\u0001l\u0001e\u0001g\u0001e\u0002\uffff\u0001t\u0001d\u0001n\u0001f\u0001m\u0001t\u0001n\u0001h\u0001$\u0001c\u0001$\u0001r\u0001\uffff\u0001i\u0001$\u0001\uffff\u0001a\u0002\uffff\u0001g\u0001t\u0002c\u0001$\u0001e\u0001$\u0001\uffff\u0001$\u0001\uffff\u0001y\u0001\uffff\u0001o\u0002\uffff\u0001n\u0001\uffff\u0001u\u0002\uffff\u0001t\u0001$\u0001e\u0002$\u0001s\u0001c\u0001a\u0001e\u0003$\u0001\uffff\u0001$\u0001\uffff\u0001o\u0001l\u0001\uffff\u0001c\u0002e\u0001t\u0001$\u0001\uffff\u0001n\u0002\uffff\u0001$\u0001n\u0001$\u0001e\u0001$\u0001\uffff\u0001r\u0002\uffff\u0001$\u0001e\u0001c\u0001n\u0004\uffff\u0001n\u0001e\u0001t\u0002$\u0001e\u0001\uffff\u0001t\u0001\uffff\u0001$\u0001\uffff\u0001$\u0001\uffff\u0001$\u0001\uffff\u0001o\u0001e\u0001t\u0001i\u0002$\u0002\uffff\u0001d\u0001$\u0003\uffff\u0001f\u0001$\u0001s\u0001z\u0002\uffff\u0001$\u0001\uffff\u0001$\u0001\uffff\u0001$\u0001e\u0003\uffff\u0001d\u0001$\u0001\uffff"
      );
      t4 = com.aspose.slides.internal.n5.x8.l6(
         "\u0001　\u0001u\u0001y\u0001u\u0001y\u0002o\u0001x\u0001n\u0001e\u0001y\u0001o\u0001i\u0001b\u0002o\u0001u\u0006\uffff\u00019\u0002\uffff\u0001=\u0001>\u0007=\u0001|\u0001=\u0003\uffff\u0001\uffff\u0003\uffff\u0001x\u0002\uffff\u0001l\u0001w\u0001t\u0001y\u0001r\u0001p\u0001l\u0001n\u0001r\u0001n\u0001o\u0001e\u0001o\u0002t\u0001n\u0002a\u0001l\u0001z\u0001s\u0001u\u0001t\u0002z\u0001p\u0001t\u0001i\u0001o\u0001a\u0001p\u0001n\u0001r\u0001l\u0001i\u0001t\u0001s\u0001t\u0001n\u0001c\u0001o\u0001b\u0002\uffff\u0001=\u0002\uffff\u0001>\u0001\uffff\u0001=\u0001\uffff\u0001=\u0013\uffff\u0001\uffff\u0006\uffff\u0001l\u0001z\u0001i\u0001e\u0001z\u0001n\u0001s\u0001o\u0001e\u0001s\u0001a\u0001z\u0001c\u0002a\u0001l\u0002e\u0001c\u0001t\u0001r\u0001s\u0001a\u0001e\u0001u\u0001b\u0001\uffff\u0001e\u0001m\u0001o\u0001e\u0001\uffff\u0001t\u0001z\u0001\uffff\u0001o\u0001u\u0001t\u0001r\u0001t\u0001e\u0001c\u0001z\u0001d\u0001a\u0001l\u0001h\u0001t\u0001o\u0001g\u0001k\u0001v\u0001t\u0001l\u0002\uffff\u0001=\u0007\uffff\u0001z\u0001\uffff\u0001v\u0001z\u0001\uffff\u0001s\u0001z\u0001w\u0001o\u0001e\u0001l\u0001\uffff\u0002t\u0001k\u0001e\u0002z\u0001h\u0001i\u0001t\u0001z\u0001s\u0001u\u0001t\u0001g\u0001l\u0002z\u0001r\u0001n\u0001a\u0001r\u0001\uffff\u0001e\u0002r\u0001c\u0001t\u0001i\u0001r\u0001h\u0001\uffff\u0001z\u0001t\u0001e\u0001z\u0001r\u0002z\u0002a\u0001e\u0001i\u0003\uffff\u0001e\u0001\uffff\u0001i\u0001\uffff\u0001z\u0001f\u0002z\u0001i\u0002z\u0001a\u0002\uffff\u0001z\u0001n\u0001z\u0001\uffff\u0001z\u0001l\u0001e\u0001g\u0001e\u0002\uffff\u0001t\u0001d\u0001n\u0001f\u0001m\u0001t\u0001n\u0001h\u0001z\u0001c\u0001z\u0001r\u0001\uffff\u0001i\u0001z\u0001\uffff\u0001a\u0002\uffff\u0001g\u0001t\u0002c\u0001z\u0001e\u0001z\u0001\uffff\u0001z\u0001\uffff\u0001y\u0001\uffff\u0001o\u0002\uffff\u0001n\u0001\uffff\u0001u\u0002\uffff\u0001t\u0001z\u0001e\u0002z\u0001s\u0001c\u0001a\u0001e\u0003z\u0001\uffff\u0001z\u0001\uffff\u0001o\u0001l\u0001\uffff\u0001c\u0002e\u0001t\u0001z\u0001\uffff\u0001n\u0002\uffff\u0001z\u0001n\u0001z\u0001e\u0001z\u0001\uffff\u0001r\u0002\uffff\u0001z\u0001e\u0001c\u0001n\u0004\uffff\u0001n\u0001e\u0001t\u0002z\u0001e\u0001\uffff\u0001t\u0001\uffff\u0001z\u0001\uffff\u0001z\u0001\uffff\u0001z\u0001\uffff\u0001o\u0001e\u0001t\u0001i\u0002z\u0002\uffff\u0001d\u0001z\u0003\uffff\u0001f\u0001z\u0001s\u0001z\u0002\uffff\u0001z\u0001\uffff\u0001z\u0001\uffff\u0001z\u0001e\u0003\uffff\u0001d\u0001z\u0001\uffff"
      );
      q0 = com.aspose.slides.internal.n5.x8.n5(
         "\u0011\uffff\u0001<\u0001=\u0001>\u0001?\u0001@\u0001A\u0001\uffff\u0001C\u0001D\u000b\uffff\u0001Z\u0001]\u0001^\u0001\uffff\u0001l\u0001m\u0001p\u0001\uffff\u0001q\u0001t*\uffff\u0001B\u0001G\u0001\uffff\u0001E\u0001H\u0001\uffff\u0001F\u0001\uffff\u0001_\u0001\uffff\u0001Y\u0001Q\u0001`\u0001M\u0001R\u0001a\u0001N\u0001b\u0001O\u0001c\u0001P\u0001[\u0001g\u0001V\u0001\\\u0001h\u0001W\u0001i\u0001X\u0001\uffff\u0001n\u0001o\u0001j\u0001u\u0001s\u0001r\u001a\uffff\u0001\n\u0004\uffff\u0001\u000f\u0002\uffff\u0001\u0010\u0013\uffff\u0001d\u0001S\u0001\uffff\u0001e\u0001T\u0001K\u0001I\u0001L\u0001J\u0001k\u0001\uffff\u0001\u0012\u0002\uffff\u0001\u0017\u0006\uffff\u0001\r\u0015\uffff\u0001-\b\uffff\u0001\u0019\u000b\uffff\u0001f\u0001U\u0001\u0001\u0001\uffff\u0001\u0002\u0001\uffff\u0001\u0015\b\uffff\u0001\u001f\u0001\u0005\u0003\uffff\u0001 \u0005\uffff\u0001\u000b\u0001%\f\uffff\u0001\u001a\u0002\uffff\u0001\u001c\u0001\uffff\u0001*\u0001/\u0007\uffff\u0001\u0016\u0001\uffff\u0001\u0003\u0001\uffff\u0001(\u0001\uffff\u0001)\u0001\u0004\u0001\uffff\u0001\u0006\u0001\uffff\u0001\"\u0001!\f\uffff\u00015\u0001\uffff\u00017\u0002\uffff\u0001\u001b\u0005\uffff\u00010\u0001\uffff\u00019\u0001\u0018\u0005\uffff\u0001\t\u0001\uffff\u0001$\u0001&\u0004\uffff\u0001,\u0001\u0013\u0001\u0014\u00016\u0006\uffff\u00014\u0001\uffff\u0001\f\u0001\uffff\u0001\u001e\u0001\uffff\u0001\b\u0001\uffff\u0001'\u0006\uffff\u00011\u00012\u0002\uffff\u0001\u000e\u0001\u0007\u0001#\u0004\uffff\u0001;\u0001\u001d\u0001\uffff\u0001:\u0001\uffff\u0001.\u0002\uffff\u00013\u0001\u0011\u0001+\u0002\uffff\u00018"
      );
      z3 = com.aspose.slides.internal.n5.x8.n5("(\uffff\u0001\u0000M\uffff\u0001\u0001ę\uffff}>");
      var0 = y4.length;
      m1 = new short[var0][];

      for (int var3 = 0; var3 < var0; var3++) {
         m1[var3] = com.aspose.slides.internal.n5.x8.n5(y4[var3]);
      }
   }
}
