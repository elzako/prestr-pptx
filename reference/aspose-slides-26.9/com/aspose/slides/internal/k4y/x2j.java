package com.aspose.slides.internal.k4y;

public class x2j extends b3 {
   private long l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private int h0;
   private long c8;
   private boolean t2;
   private boolean s7;
   private long x8;
   private boolean n3;
   private boolean y4;
   private long e2;
   private long t9;
   private long z1;
   private long t4;
   private long q0;
   private long z3;
   private String m1;
   private String k7;
   private String m3;
   private long z8;
   private b4o j5;
   private m0y w1;
   private p9l r4;
   private h5c c4;
   private l0k y2;
   public static final int n5 = g2h.n5("worksheet");
   private static final com.aspose.slides.internal.v6g.u9 y1 = new com.aspose.slides.internal.v6g.u9(
      "id",
      "name",
      "displayName",
      "comment",
      "ref",
      "tableType",
      "headerRowCount",
      "insertRow",
      "insertRowShift",
      "totalsRowCount",
      "totalsRowShown",
      "published",
      "headerRowDxfId",
      "dataDxfId",
      "totalsRowDxfId",
      "headerRowBorderDxfId",
      "tableBorderDxfId",
      "totalsRowBorderDxfId",
      "headerRowCellStyle",
      "dataCellStyle",
      "totalsRowCellStyle",
      "connectionId",
      "autoFilter",
      "sortState",
      "tableColumns",
      "tableStyleInfo",
      "extLst"
   );

   public x2j(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.y1();
      x2j$1 var2 = new x2j$1(this);
      n5(var1, var2);
      n5(var1, new x2j$2(this, var1));
   }

   public x2j() {
      this.y1();
      this.r4 = new p9l();
   }

   private void y1() {
      this.h0 = n5;
      this.c8 = 1L;
      this.t2 = false;
      this.s7 = false;
      this.x8 = 0L;
      this.n3 = true;
      this.y4 = false;
      this.e2 = 4294967295L;
      this.t9 = 4294967295L;
      this.z1 = 4294967295L;
      this.t4 = 4294967295L;
      this.q0 = 4294967295L;
      this.z3 = 4294967295L;
      this.z8 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("ssml", var3, "http://schemas.openxmlformats.org/spreadsheetml/2006/main");
      var2.l6("id", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      if (this.k5 != null) {
         var2.l6("name", this.k5);
      }

      var2.l6("displayName", this.u3);
      if (this.a6 != null) {
         var2.l6("comment", this.a6);
      }

      var2.l6("ref", this.u9);
      if (this.h0 != n5) {
         var2.l6("tableType", g2h.n5(this.h0));
      }

      if ((this.c8 & 4294967295L) != 1L) {
         var2.l6("headerRowCount", com.aspose.slides.ms.System.Xml.f4.l6(this.c8));
      }

      if (this.t2) {
         var2.l6("insertRow", this.t2 ? "1" : "0");
      }

      if (this.s7) {
         var2.l6("insertRowShift", this.s7 ? "1" : "0");
      }

      if ((this.x8 & 4294967295L) != 0L) {
         var2.l6("totalsRowCount", com.aspose.slides.ms.System.Xml.f4.l6(this.x8));
      }

      if (!this.n3) {
         var2.l6("totalsRowShown", this.n3 ? "1" : "0");
      }

      if (this.y4) {
         var2.l6("published", this.y4 ? "1" : "0");
      }

      if ((this.e2 & 4294967295L) != 4294967295L) {
         var2.l6("headerRowDxfId", com.aspose.slides.ms.System.Xml.f4.l6(this.e2));
      }

      if ((this.t9 & 4294967295L) != 4294967295L) {
         var2.l6("dataDxfId", com.aspose.slides.ms.System.Xml.f4.l6(this.t9));
      }

      if ((this.z1 & 4294967295L) != 4294967295L) {
         var2.l6("totalsRowDxfId", com.aspose.slides.ms.System.Xml.f4.l6(this.z1));
      }

      if ((this.t4 & 4294967295L) != 4294967295L) {
         var2.l6("headerRowBorderDxfId", com.aspose.slides.ms.System.Xml.f4.l6(this.t4));
      }

      if ((this.q0 & 4294967295L) != 4294967295L) {
         var2.l6("tableBorderDxfId", com.aspose.slides.ms.System.Xml.f4.l6(this.q0));
      }

      if ((this.z3 & 4294967295L) != 4294967295L) {
         var2.l6("totalsRowBorderDxfId", com.aspose.slides.ms.System.Xml.f4.l6(this.z3));
      }

      if (this.m1 != null) {
         var2.l6("headerRowCellStyle", this.m1);
      }

      if (this.k7 != null) {
         var2.l6("dataCellStyle", this.k7);
      }

      if (this.m3 != null) {
         var2.l6("totalsRowCellStyle", this.m3);
      }

      if ((this.z8 & 4294967295L) != 4294967295L) {
         var2.l6("connectionId", com.aspose.slides.ms.System.Xml.f4.l6(this.z8));
      }

      if (this.j5 != null) {
         this.j5.n5("ssml", var2, "autoFilter");
      }

      if (this.w1 != null) {
         this.w1.n5("ssml", var2, "sortState");
      }

      this.r4.n5("ssml", var2, "tableColumns");
      if (this.c4 != null) {
         this.c4.n5("ssml", var2, "tableStyleInfo");
      }

      if (this.y2 != null) {
         this.y2.n5("ssml", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(b4o var1) {
      this.j5 = var1;
   }

   public final void n5(m0y var1) {
      this.w1 = var1;
   }

   public final void n5(h5c var1) {
      this.c4 = var1;
   }

   public final void n5(l0k var1) {
      this.y2 = var1;
   }

   public final long n5() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   public final String l6() {
      return this.k5;
   }

   public final void n5(String var1) {
      this.k5 = var1;
   }

   public final String k5() {
      return this.u3;
   }

   public final void l6(String var1) {
      this.u3 = var1;
   }

   public final String u3() {
      return this.a6;
   }

   public final void k5(String var1) {
      this.a6 = var1;
   }

   public final String a6() {
      return this.u9;
   }

   public final void u3(String var1) {
      this.u9 = var1;
   }

   public final int u9() {
      return this.h0;
   }

   public final void n5(int var1) {
      this.h0 = var1;
   }

   public final long h0() {
      return this.c8;
   }

   public final void l6(long var1) {
      this.c8 = var1;
   }

   public final boolean c8() {
      return this.t2;
   }

   public final void n5(boolean var1) {
      this.t2 = var1;
   }

   public final boolean t2() {
      return this.s7;
   }

   public final void l6(boolean var1) {
      this.s7 = var1;
   }

   public final long s7() {
      return this.x8;
   }

   public final void k5(long var1) {
      this.x8 = var1;
   }

   public final boolean x8() {
      return this.n3;
   }

   public final void k5(boolean var1) {
      this.n3 = var1;
   }

   public final boolean n3() {
      return this.y4;
   }

   public final void u3(boolean var1) {
      this.y4 = var1;
   }

   public final long y4() {
      return this.e2;
   }

   public final void u3(long var1) {
      this.e2 = var1;
   }

   public final long e2() {
      return this.t9;
   }

   public final void a6(long var1) {
      this.t9 = var1;
   }

   public final long t9() {
      return this.z1;
   }

   public final void u9(long var1) {
      this.z1 = var1;
   }

   public final long z1() {
      return this.t4;
   }

   public final void h0(long var1) {
      this.t4 = var1;
   }

   public final long t4() {
      return this.q0;
   }

   public final void c8(long var1) {
      this.q0 = var1;
   }

   public final long q0() {
      return this.z3;
   }

   public final void t2(long var1) {
      this.z3 = var1;
   }

   public final String z3() {
      return this.m1;
   }

   public final void a6(String var1) {
      this.m1 = var1;
   }

   public final String m1() {
      return this.k7;
   }

   public final void u9(String var1) {
      this.k7 = var1;
   }

   public final String k7() {
      return this.m3;
   }

   public final void h0(String var1) {
      this.m3 = var1;
   }

   public final long m3() {
      return this.z8;
   }

   public final void s7(long var1) {
      this.z8 = var1;
   }

   public final b4o z8() {
      return this.j5;
   }

   public final m0y j5() {
      return this.w1;
   }

   public final p9l w1() {
      return this.r4;
   }

   public final h5c r4() {
      return this.c4;
   }

   public final l0k c4() {
      return this.y2;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 y2() {
      return y1;
   }

   // $VF: synthetic method
   static long n5(x2j var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(x2j var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(x2j var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(x2j var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u3(x2j var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int n5(x2j var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static long l6(x2j var0, long var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean n5(x2j var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean l6(x2j var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static long k5(x2j var0, long var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static boolean k5(x2j var0, boolean var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static boolean u3(x2j var0, boolean var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static long u3(x2j var0, long var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static long a6(x2j var0, long var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static long u9(x2j var0, long var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static long h0(x2j var0, long var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static long c8(x2j var0, long var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static long t2(x2j var0, long var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static String a6(x2j var0, String var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static String u9(x2j var0, String var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static String h0(x2j var0, String var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static long s7(x2j var0, long var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static b4o n5(x2j var0, b4o var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static m0y n5(x2j var0, m0y var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static p9l n5(x2j var0, p9l var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static h5c n5(x2j var0, h5c var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static l0k n5(x2j var0, l0k var1) {
      return var0.y2 = var1;
   }
}
