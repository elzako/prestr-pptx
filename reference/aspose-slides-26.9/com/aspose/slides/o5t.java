package com.aspose.slides;

class o5t extends s3 {
   private int n5 = 1;
   private double l6 = 15.0;
   private double k5 = 35.0;
   private double u3 = 90.0;
   private double a6 = 90.0;
   private int u9;
   private boolean h0;
   private boolean c8;
   private boolean t2;
   private int s7 = 2;
   private int x8 = 2;
   private int n3 = 0;
   private int y4 = 0;
   private int e2;
   private int t9;
   private static final com.aspose.slides.internal.v6g.u9 z1 = new com.aspose.slides.internal.v6g.u9("upr", "grav");

   public final int k5() {
      return this.n5;
   }

   public final double u3() {
      return this.l6;
   }

   public final double a6() {
      return this.k5;
   }

   public final double u9() {
      return this.u3;
   }

   public final double h0() {
      return this.a6;
   }

   public final int c8() {
      return this.s7;
   }

   public final int t2() {
      return this.n3;
   }

   public final int s7() {
      return this.u9;
   }

   public final int x8() {
      return this.e2;
   }

   public final int n3() {
      return this.t9;
   }

   public final boolean y4() {
      return this.h0;
   }

   public final boolean e2() {
      return this.c8;
   }

   public final boolean t9() {
      return this.t2;
   }

   public o5t(com.aspose.slides.internal.k4y.p5i var1) {
      this.u9 = 2;
      this.e2 = 2;
      this.t9 = 1;
      this.h0 = false;
      this.c8 = false;
      this.t2 = false;

      for (com.aspose.slides.internal.k4y.s6m var5 : var1.l6()) {
         switch (var5.n5()) {
            case 2:
               this.n5 = this.u3(var5.l6());
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 22:
            case 27:
            case 28:
            case 29:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 43:
            case 44:
            case 45:
            case 47:
            case 53:
            default:
               break;
            case 21:
               this.n5(n5(var5.l6()));
               break;
            case 23:
               this.l6 = n5(var5.l6(), 15.0);
               break;
            case 24:
               this.k5 = n5(var5.l6(), 35.0);
               break;
            case 25:
               this.u3 = n5(var5.l6(), 90.0);
               break;
            case 26:
               this.a6 = n5(var5.l6(), 90.0);
               break;
            case 30:
               this.s7 = n5(var5.l6());
               this.n3 = this.s7;
               break;
            case 31:
               this.x8 = n5(var5.l6());
               this.y4 = this.x8;
               break;
            case 41:
               this.n3 = n5(var5.l6());
               break;
            case 42:
               this.y4 = n5(var5.l6());
               break;
            case 46:
               this.u9 = com.aspose.slides.ms.System.a3.n5(var5.l6());
               break;
            case 48:
               this.c8 = "ctr".equals(var5.l6());
               break;
            case 49:
               this.t2 = "ctr".equals(var5.l6());
               break;
            case 50:
               this.e2 = l6(var5.l6());
               break;
            case 51:
               this.t9 = l6(var5.l6());
               break;
            case 52:
               this.h0 = "vert".equals(var5.l6());
               break;
            case 54:
               this.l6(l6(var5.l6()));
         }
      }

      if (this.n3 == 0) {
         this.n3 = 1;
      }

      if (this.y4 == 0) {
         this.y4 = 3;
      }
   }

   private int u3(String var1) {
      switch (z1.n5(var1)) {
         case 0:
            return 1;
         case 1:
            return 2;
         default:
            return 0;
      }
   }
}
