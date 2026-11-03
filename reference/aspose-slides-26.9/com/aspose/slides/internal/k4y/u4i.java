package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class u4i extends b3 {
   private com.aspose.slides.ms.System.o0 k5 = new com.aspose.slides.ms.System.o0();
   private com.aspose.slides.ms.System.o0 u3 = new com.aspose.slides.ms.System.o0();
   private int a6;
   private com.aspose.slides.ms.System.j5 u9 = new com.aspose.slides.ms.System.j5();
   private com.aspose.slides.ms.System.j5 h0 = new com.aspose.slides.ms.System.j5();
   private String c8;
   private float t2;
   private n6p s7;
   private t6g x8;
   private e0w n3;
   private h1i y4;
   private s2b e2;
   private z6s t9;
   private j3z z1;
   private y1g t4;
   public static final int n5 = b3o.n5("active");
   public static final com.aspose.slides.ms.System.j5 l6 = com.aspose.slides.ms.System.j5.l6.m3();
   private static final com.aspose.slides.internal.v6g.u9 q0 = new com.aspose.slides.internal.v6g.u9(
      "id",
      "authorId",
      "status",
      "created",
      "startDate",
      "assignedTo",
      "complete",
      "sldMkLst",
      "deMkLst",
      "txMkLst",
      "unknownAnchor",
      "pos",
      "replyLst",
      "txBody",
      "extLst"
   );

   public u4i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.t4();
      u4i$1 var2 = new u4i$1(this);
      n5(var1, var2);
      n5(var1, new u4i$2(this, var1));
   }

   public u4i() {
      this.t4();
   }

   private void t4() {
      com.aspose.slides.ms.System.o0.n5.k5(this.k5);
      com.aspose.slides.ms.System.o0.n5.k5(this.u3);
      this.a6 = n5;
      com.aspose.slides.ms.System.j5.l6.u3(this.u9);
      l6.u3(this.h0);
      this.c8 = "";
      this.t2 = 0.0F;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("id", com.aspose.slides.ms.System.d1.n5(new String[]{"{", com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.Xml.f4.n5(this.k5.k5())), "}"}));
      var2.l6("authorId", com.aspose.slides.ms.System.d1.n5(new String[]{"{", com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.Xml.f4.n5(this.u3.k5())), "}"}));
      if (this.a6 != n5) {
         var2.l6("status", b3o.n5(this.a6));
      }

      var2.l6("created", com.aspose.slides.ms.System.Xml.f4.n5(this.u9.m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"));
      if (com.aspose.slides.ms.System.j5.c8(this.h0, l6)) {
         var2.l6("startDate", com.aspose.slides.ms.System.Xml.f4.n5(this.h0.m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"));
      }

      if (!"".equals(this.c8)) {
         var2.l6("assignedTo", this.c8);
      }

      if (this.t2 != 0.0F) {
         if (var2.n5) {
            var2.l6("complete", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.t2), "%"}));
         } else {
            var2.l6(
               "complete",
               com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.t2 * 1000.0F), 14))
            );
         }
      }

      if (this.s7 != null) {
         this.s7.n5("p188", var2, "sldMkLst");
      }

      if (this.x8 != null) {
         this.x8.n5("p188", var2, "deMkLst");
      }

      if (this.n3 != null) {
         this.n3.n5("p188", var2, "txMkLst");
      }

      if (this.y4 != null) {
         this.y4.n5("p188", var2, "unknownAnchor");
      }

      if (this.e2 != null) {
         this.e2.n5("p188", var2, "pos");
      }

      if (this.t9 != null) {
         this.t9.n5("p188", var2, "replyLst");
      }

      if (this.z1 != null) {
         this.z1.n5("p188", var2, "txBody");
      }

      if (this.t4 != null) {
         this.t4.n5("p188", var2, "extLst");
      }

      var2.s7();
   }

   public final n6p n5() {
      if (this.s7 != null) {
         throw new Exception("Only one <sldMkLst> element can be added.");
      }

      this.s7 = new n6p();
      return this.s7;
   }

   public final t6g l6() {
      if (this.x8 != null) {
         throw new Exception("Only one <deMkLst> element can be added.");
      }

      this.x8 = new t6g();
      return this.x8;
   }

   public final e0w k5() {
      if (this.n3 != null) {
         throw new Exception("Only one <txMkLst> element can be added.");
      }

      this.n3 = new e0w();
      return this.n3;
   }

   public final s2b u3() {
      if (this.e2 != null) {
         throw new Exception("Only one <pos> element can be added.");
      }

      this.e2 = new s2b();
      return this.e2;
   }

   public final z6s a6() {
      if (this.t9 != null) {
         throw new Exception("Only one <replyLst> element can be added.");
      }

      this.t9 = new z6s();
      return this.t9;
   }

   public final j3z u9() {
      if (this.z1 != null) {
         throw new Exception("Only one <txBody> element can be added.");
      }

      this.z1 = new j3z();
      return this.z1;
   }

   public final com.aspose.slides.ms.System.o0 h0() {
      return this.k5;
   }

   public final void n5(com.aspose.slides.ms.System.o0 var1) {
      var1.k5(this.k5);
   }

   public final com.aspose.slides.ms.System.o0 c8() {
      return this.u3;
   }

   public final void l6(com.aspose.slides.ms.System.o0 var1) {
      var1.k5(this.u3);
   }

   public final int t2() {
      return this.a6;
   }

   public final void n5(int var1) {
      this.a6 = var1;
   }

   public final com.aspose.slides.ms.System.j5 s7() {
      return this.u9;
   }

   public final void n5(com.aspose.slides.ms.System.j5 var1) {
      var1.u3(this.u9);
   }

   public final t6g x8() {
      return this.x8;
   }

   public final e0w n3() {
      return this.n3;
   }

   public final s2b y4() {
      return this.e2;
   }

   public final z6s e2() {
      return this.t9;
   }

   public final j3z t9() {
      return this.z1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 z1() {
      return q0;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.o0 n5(u4i var0, com.aspose.slides.ms.System.o0 var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.o0 l6(u4i var0, com.aspose.slides.ms.System.o0 var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int n5(u4i var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 n5(u4i var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 l6(u4i var0) {
      return var0.h0;
   }

   // $VF: synthetic method
   static String n5(u4i var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static float n5(u4i var0, float var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static n6p n5(u4i var0, n6p var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static t6g n5(u4i var0, t6g var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static e0w n5(u4i var0, e0w var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static h1i n5(u4i var0, h1i var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static s2b n5(u4i var0, s2b var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static z6s n5(u4i var0, z6s var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static j3z n5(u4i var0, j3z var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static y1g n5(u4i var0, y1g var1) {
      return var0.t4 = var1;
   }
}
