package com.aspose.slides.internal.k4y;

public class u8j extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private long h0;
   private boolean c8;
   private boolean t2;
   private boolean s7;
   private boolean x8;
   private long n3;
   private String y4;
   private boolean e2;
   private boolean t9;
   private String z1;
   private static final com.aspose.slides.internal.v6g.u9 t4 = new com.aspose.slides.internal.v6g.u9(
      "name",
      "comment",
      "customMenu",
      "description",
      "help",
      "statusBar",
      "localSheetId",
      "hidden",
      "function",
      "vbProcedure",
      "xlm",
      "functionGroupId",
      "shortcutKey",
      "publishToServer",
      "workbookParameter"
   );

   public u8j(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      u8j$1 var2 = new u8j$1(this);
      n5(var1, var2);
      if (!var1.m1()) {
         var1.u9();
         this.z1 = var1.z1();
      }
   }

   public u8j() {
      this.u3();
   }

   private void u3() {
      this.h0 = 4294967295L;
      this.c8 = false;
      this.t2 = false;
      this.s7 = false;
      this.x8 = false;
      this.n3 = 4294967295L;
      this.e2 = false;
      this.t9 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("name", this.n5);
      if (this.l6 != null) {
         var2.l6("comment", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("customMenu", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("description", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("help", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("statusBar", this.u9);
      }

      if ((this.h0 & 4294967295L) != 4294967295L) {
         var2.l6("localSheetId", com.aspose.slides.ms.System.Xml.f4.l6(this.h0));
      }

      if (this.c8) {
         var2.l6("hidden", this.c8 ? "1" : "0");
      }

      if (this.t2) {
         var2.l6("function", this.t2 ? "1" : "0");
      }

      if (this.s7) {
         var2.l6("vbProcedure", this.s7 ? "1" : "0");
      }

      if (this.x8) {
         var2.l6("xlm", this.x8 ? "1" : "0");
      }

      if ((this.n3 & 4294967295L) != 4294967295L) {
         var2.l6("functionGroupId", com.aspose.slides.ms.System.Xml.f4.l6(this.n3));
      }

      if (this.y4 != null) {
         var2.l6("shortcutKey", this.y4);
      }

      if (this.e2) {
         var2.l6("publishToServer", this.e2 ? "1" : "0");
      }

      if (this.t9) {
         var2.l6("workbookParameter", this.t9 ? "1" : "0");
      }

      var2.l6(this.z1);
      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final String l6() {
      return this.z1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return t4;
   }

   // $VF: synthetic method
   static String n5(u8j var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(u8j var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(u8j var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(u8j var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(u8j var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u9(u8j var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static long n5(u8j var0, long var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean n5(u8j var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean l6(u8j var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean k5(u8j var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static boolean u3(u8j var0, boolean var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static long l6(u8j var0, long var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String h0(u8j var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static boolean a6(u8j var0, boolean var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static boolean u9(u8j var0, boolean var1) {
      return var0.t9 = var1;
   }
}
