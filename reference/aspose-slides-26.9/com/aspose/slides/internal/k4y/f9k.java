package com.aspose.slides.internal.k4y;

public class f9k extends b3 {
   private int n5;
   private boolean l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private boolean t2;
   private boolean s7;
   private boolean x8;
   private boolean n3;
   private boolean y4;
   private boolean e2;
   private boolean t9;
   private boolean z1;
   private boolean t4;
   private static final com.aspose.slides.internal.v6g.u9 q0 = new com.aspose.slides.internal.v6g.u9(
      "password",
      "sheet",
      "objects",
      "scenarios",
      "formatCells",
      "formatColumns",
      "formatRows",
      "insertColumns",
      "insertRows",
      "insertHyperlinks",
      "deleteColumns",
      "deleteRows",
      "selectLockedCells",
      "sort",
      "autoFilter",
      "pivotTables",
      "selectUnlockedCells"
   );

   public f9k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      f9k$1 var2 = new f9k$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public f9k() {
      this.l6();
   }

   private void l6() {
      this.n5 = 65535;
      this.l6 = false;
      this.k5 = false;
      this.u3 = false;
      this.a6 = true;
      this.u9 = true;
      this.h0 = true;
      this.c8 = true;
      this.t2 = true;
      this.s7 = true;
      this.x8 = true;
      this.n3 = true;
      this.y4 = false;
      this.e2 = true;
      this.t9 = true;
      this.z1 = true;
      this.t4 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 65535) != 65535) {
         var2.l6("password", com.aspose.slides.ms.System.a3.n5(this.n5 & 65535 & 65535, "X4"));
      }

      if (this.l6) {
         var2.l6("sheet", this.l6 ? "1" : "0");
      }

      if (this.k5) {
         var2.l6("objects", this.k5 ? "1" : "0");
      }

      if (this.u3) {
         var2.l6("scenarios", this.u3 ? "1" : "0");
      }

      if (!this.a6) {
         var2.l6("formatCells", this.a6 ? "1" : "0");
      }

      if (!this.u9) {
         var2.l6("formatColumns", this.u9 ? "1" : "0");
      }

      if (!this.h0) {
         var2.l6("formatRows", this.h0 ? "1" : "0");
      }

      if (!this.c8) {
         var2.l6("insertColumns", this.c8 ? "1" : "0");
      }

      if (!this.t2) {
         var2.l6("insertRows", this.t2 ? "1" : "0");
      }

      if (!this.s7) {
         var2.l6("insertHyperlinks", this.s7 ? "1" : "0");
      }

      if (!this.x8) {
         var2.l6("deleteColumns", this.x8 ? "1" : "0");
      }

      if (!this.n3) {
         var2.l6("deleteRows", this.n3 ? "1" : "0");
      }

      if (this.y4) {
         var2.l6("selectLockedCells", this.y4 ? "1" : "0");
      }

      if (!this.e2) {
         var2.l6("sort", this.e2 ? "1" : "0");
      }

      if (!this.t9) {
         var2.l6("autoFilter", this.t9 ? "1" : "0");
      }

      if (!this.z1) {
         var2.l6("pivotTables", this.z1 ? "1" : "0");
      }

      if (this.t4) {
         var2.l6("selectUnlockedCells", this.t4 ? "1" : "0");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return q0;
   }

   // $VF: synthetic method
   static int n5(f9k var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(f9k var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(f9k var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean k5(f9k var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean u3(f9k var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean a6(f9k var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean u9(f9k var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean h0(f9k var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean c8(f9k var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean t2(f9k var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static boolean s7(f9k var0, boolean var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static boolean x8(f9k var0, boolean var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static boolean n3(f9k var0, boolean var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static boolean y4(f9k var0, boolean var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static boolean e2(f9k var0, boolean var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static boolean t9(f9k var0, boolean var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static boolean z1(f9k var0, boolean var1) {
      return var0.t4 = var1;
   }
}
