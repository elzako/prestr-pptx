package com.aspose.slides;

class y6x {
   private int n5;
   private int l6;
   private char k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private int s7;
   private String x8;
   private String n3;
   private String y4;
   private char e2;
   private String t9;
   private String z1;
   private String t4;
   private char q0;
   private String z3;
   private boolean m1;

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   private void l6(int var1) {
      this.l6 = var1;
   }

   public final char k5() {
      return this.k5;
   }

   private void n5(char var1) {
      this.k5 = var1;
   }

   public final String u3() {
      return this.u3;
   }

   private void n5(String var1) {
      this.u3 = var1;
   }

   public final String a6() {
      return this.a6;
   }

   private void l6(String var1) {
      this.a6 = var1;
   }

   public final String u9() {
      return this.u9;
   }

   private void k5(String var1) {
      this.u9 = var1;
   }

   public final String h0() {
      return this.h0;
   }

   private void u3(String var1) {
      this.h0 = var1;
   }

   public final String c8() {
      return this.c8;
   }

   private void a6(String var1) {
      this.c8 = var1;
   }

   public final String t2() {
      return this.t2;
   }

   private void u9(String var1) {
      this.t2 = var1;
   }

   public final int s7() {
      return this.s7;
   }

   private void k5(int var1) {
      this.s7 = var1;
   }

   public final String x8() {
      return this.x8;
   }

   private void h0(String var1) {
      this.x8 = var1;
   }

   public final String n3() {
      return this.n3;
   }

   private void c8(String var1) {
      this.n3 = var1;
   }

   public final String y4() {
      return this.y4;
   }

   private void t2(String var1) {
      this.y4 = var1;
   }

   public final char e2() {
      return this.e2;
   }

   private void l6(char var1) {
      this.e2 = var1;
   }

   public final String t9() {
      return this.t9;
   }

   private void s7(String var1) {
      this.t9 = var1;
   }

   public final String z1() {
      return this.z1;
   }

   private void x8(String var1) {
      this.z1 = var1;
   }

   public final String t4() {
      return this.t4;
   }

   private void n3(String var1) {
      this.t4 = var1;
   }

   public final char q0() {
      return this.q0;
   }

   private void k5(char var1) {
      this.q0 = var1;
   }

   public final String z3() {
      return this.z3;
   }

   private void y4(String var1) {
      this.z3 = var1;
   }

   public final boolean m1() {
      return this.m1;
   }

   private void n5(boolean var1) {
      this.m1 = var1;
   }

   public y6x() {
      this.n5(0, 1, false, 1);
   }

   public y6x(int var1, int var2, boolean var3, int var4) {
      this.n5(var1, var2, var3, var4);
   }

   private void n5(int var1, int var2, boolean var3, int var4) {
      this.e2(var1);
      this.t2(var1);
      this.s7(var1);
      this.y4(var1);
      this.t9(var1);
      this.u3(var1);
      this.u9(var1);
      this.h0(var1);
      this.c8(var1);
      this.n3(var1);
      this.z1(var1);
      this.a6(var1);
      this.x8(var2);
      this.n5(var4);
      this.n5(var3);
   }

   private void u3(int var1) {
      switch (var1) {
         case 21:
            this.n5('=');
            break;
         default:
            this.n5('#');
      }
   }

   private void a6(int var1) {
      switch (var1) {
         case 21:
            this.n5("~");
            break;
         default:
            this.n5("\\");
      }
   }

   private void u9(int var1) {
      switch (var1) {
         case 21:
            this.l6("[[image:{0}]]");
            break;
         default:
            this.l6("![{0}]({1})");
      }
   }

   private void h0(int var1) {
      switch (var1) {
         case 21:
            this.k5("//{0}//");
            break;
         default:
            this.k5("*{0}*");
      }
   }

   private void c8(int var1) {
      switch (var1) {
         case 21:
            this.a6("[[{0}>>{1}]]");
            this.u9("[[");
            this.u3(">>{0}]]");
            break;
         default:
            this.a6("[{0}]({1})");
            this.u9("[");
            this.u3("]({0})");
      }
   }

   private void t2(int var1) {
      switch (var1) {
         case 0:
         case 1:
         case 3:
         case 4:
         case 6:
         case 8:
         case 9:
         case 11:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 22:
            this.l6(this.l6() | 8);
            break;
         case 2:
         case 5:
         case 7:
         case 10:
         case 12:
         case 20:
         default:
            this.h0("{0}~{1}~");
            break;
         case 21:
            this.h0("{0} ,,{1},,");
      }
   }

   private void s7(int var1) {
      switch (var1) {
         case 0:
         case 1:
         case 3:
         case 4:
         case 6:
         case 8:
         case 11:
         case 13:
         case 14:
         case 15:
         case 17:
         case 18:
         case 19:
         case 22:
            this.l6(this.l6() | 4);
            break;
         case 2:
         case 5:
         case 7:
         case 9:
         case 10:
         case 12:
         case 20:
         default:
            this.c8("{0}^{1}^");
            break;
         case 16:
            this.c8("{0}^({1})");
            break;
         case 21:
            this.c8("{0} ^^{1}^^");
      }
   }

   private void x8(int var1) {
      switch (var1) {
         case 0:
            this.t2(com.aspose.slides.ms.System.d1.n5(new Object[]{com.aspose.slides.ms.System.t9.q0('\r'), '\n'}));
            break;
         case 2:
            this.t2(com.aspose.slides.ms.System.t9.q0('\r'));
            break;
         default:
            this.t2(com.aspose.slides.ms.System.t9.q0('\n'));
      }
   }

   private void n3(int var1) {
      switch (var1) {
         case 21:
            this.s7("{0}1. ((({1})))");
            this.l6('1');
            this.k5(1);
            break;
         default:
            this.s7("{0}1. {1}");
            this.l6(' ');
            this.k5(4);
      }
   }

   private void y4(int var1) {
      switch (var1) {
         case 1:
         case 3:
         case 6:
         case 8:
         case 9:
         case 14:
         case 15:
         case 17:
         case 18:
         case 22:
            this.l6(this.l6() | 2);
            break;
         case 2:
         case 4:
         case 7:
            this.x8("{{--{0}--}}");
            break;
         case 5:
         case 10:
         case 11:
         case 12:
         case 13:
         case 16:
         case 19:
         case 20:
         default:
            this.x8("~~{0}~~");
            break;
         case 21:
            this.x8("--{0}--");
      }
   }

   private void e2(int var1) {
      switch (var1) {
         case 1:
         case 3:
         case 10:
         case 12:
         case 17:
         case 19:
         case 20:
            this.l6(this.l6() | 1);
         case 2:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 11:
         case 13:
         case 14:
         case 15:
         case 16:
         case 18:
      }
   }

   private void t9(int var1) {
      switch (var1) {
         case 0:
         case 1:
         case 3:
         case 4:
         case 6:
         case 8:
         case 9:
         case 11:
         case 13:
         case 15:
         case 17:
         case 18:
         case 19:
         case 20:
         case 22:
            this.l6(this.l6() | 16);
            break;
         case 2:
         case 5:
         case 7:
         default:
            this.n3("{{=={0}==}}");
            break;
         case 10:
         case 12:
         case 14:
         case 16:
            this.n3("=={0}==");
            break;
         case 21:
            this.n3("__{0}__");
      }
   }

   private void z1(int var1) {
      switch (var1) {
         case 21:
            this.y4("{0}* ((({1})))");
            this.k5('*');
            break;
         default:
            this.y4("{0}- {1}");
            this.k5(' ');
      }
   }
}
