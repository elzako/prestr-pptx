package com.aspose.slides.internal.k4y;

public class b6o extends b3 {
   private long l6;
   private String k5;
   private String u3;
   private int a6;
   private String u9;
   private long h0;
   private long c8;
   private long t2;
   private long s7;
   private String x8;
   private String n3;
   private String y4;
   private a1c e2;
   private a1c t9;
   private d3m z1;
   private l0k t4;
   public static final int n5 = o2k.n5("none");
   private static final com.aspose.slides.internal.v6g.u9 q0 = new com.aspose.slides.internal.v6g.u9(
      "id",
      "uniqueName",
      "name",
      "totalsRowFunction",
      "totalsRowLabel",
      "queryTableFieldId",
      "headerRowDxfId",
      "dataDxfId",
      "totalsRowDxfId",
      "headerRowCellStyle",
      "dataCellStyle",
      "totalsRowCellStyle",
      "calculatedColumnFormula",
      "totalsRowFormula",
      "xmlColumnPr",
      "extLst"
   );

   public b6o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      b6o$1 var2 = new b6o$1(this);
      n5(var1, var2);
      n5(var1, new b6o$2(this, var1));
   }

   public b6o() {
      this.a6();
   }

   private void a6() {
      this.a6 = n5;
      this.h0 = 4294967295L;
      this.c8 = 4294967295L;
      this.t2 = 4294967295L;
      this.s7 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("id", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      if (this.k5 != null) {
         var2.l6("uniqueName", this.k5);
      }

      var2.l6("name", this.u3);
      if (this.a6 != n5) {
         var2.l6("totalsRowFunction", o2k.n5(this.a6));
      }

      if (this.u9 != null) {
         var2.l6("totalsRowLabel", this.u9);
      }

      if ((this.h0 & 4294967295L) != 4294967295L) {
         var2.l6("queryTableFieldId", com.aspose.slides.ms.System.Xml.f4.l6(this.h0));
      }

      if ((this.c8 & 4294967295L) != 4294967295L) {
         var2.l6("headerRowDxfId", com.aspose.slides.ms.System.Xml.f4.l6(this.c8));
      }

      if ((this.t2 & 4294967295L) != 4294967295L) {
         var2.l6("dataDxfId", com.aspose.slides.ms.System.Xml.f4.l6(this.t2));
      }

      if ((this.s7 & 4294967295L) != 4294967295L) {
         var2.l6("totalsRowDxfId", com.aspose.slides.ms.System.Xml.f4.l6(this.s7));
      }

      if (this.x8 != null) {
         var2.l6("headerRowCellStyle", this.x8);
      }

      if (this.n3 != null) {
         var2.l6("dataCellStyle", this.n3);
      }

      if (this.y4 != null) {
         var2.l6("totalsRowCellStyle", this.y4);
      }

      if (this.e2 != null) {
         this.e2.n5("ssml", var2, "calculatedColumnFormula");
      }

      if (this.t9 != null) {
         this.t9.n5("ssml", var2, "totalsRowFormula");
      }

      if (this.z1 != null) {
         this.z1.n5("ssml", var2, "xmlColumnPr");
      }

      if (this.t4 != null) {
         this.t4.n5("ssml", var2, "extLst");
      }

      var2.s7();
   }

   public final long n5() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   public final String l6() {
      return this.u3;
   }

   public final void n5(String var1) {
      this.u3 = var1;
   }

   public final int k5() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return q0;
   }

   // $VF: synthetic method
   static long n5(b6o var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(b6o var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(b6o var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int n5(b6o var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String k5(b6o var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static long l6(b6o var0, long var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static long k5(b6o var0, long var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static long u3(b6o var0, long var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static long a6(b6o var0, long var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String u3(b6o var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String a6(b6o var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String u9(b6o var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static a1c n5(b6o var0, a1c var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static a1c l6(b6o var0, a1c var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static d3m n5(b6o var0, d3m var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static l0k n5(b6o var0, l0k var1) {
      return var0.t4 = var1;
   }
}
