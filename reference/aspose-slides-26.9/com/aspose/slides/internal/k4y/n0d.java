package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class n0d extends b3 {
   private int n5;
   private long l6;
   private byte k5;
   private long u3;
   private String a6;
   private String u9;
   private String h0;
   private float c8;
   private float t2;
   private float s7;
   private boolean x8;
   private byte n3;
   private byte y4;
   private byte e2;
   private String t9;
   private String z1;
   private byte t4;
   private byte q0;
   private int z3;
   private long m1;
   private byte k7;
   private byte m3;
   private byte z8;
   private float j5;
   private z2x w1;
   private z2x r4;
   private d1x c4;
   private b6z y2;
   private h7e y1;
   private h7e a0;
   private static final com.aspose.slides.internal.v6g.u9 d2 = new com.aspose.slides.internal.v6g.u9(
      "id",
      "presetID",
      "presetClass",
      "presetSubtype",
      "dur",
      "repeatCount",
      "repeatDur",
      "spd",
      "accel",
      "decel",
      "autoRev",
      "restart",
      "fill",
      "syncBehavior",
      "tmFilter",
      "evtFilter",
      "display",
      "masterRel",
      "bldLvl",
      "grpId",
      "afterEffect",
      "nodeType",
      "nodePh",
      "p14:presetBounceEnd",
      "stCondLst",
      "endCondLst",
      "endSync",
      "iterate",
      "childTnLst",
      "subTnLst"
   );

   public n0d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.p8();
      n0d$1 var2 = new n0d$1(this);
      n5(var1, var2);
      n5(var1, new n0d$2(this, var1));
   }

   public n0d() {
      this.p8();
   }

   private void p8() {
      this.n5 = -1;
      this.l6 = -2147483649L;
      this.k5 = -1;
      this.u3 = -2147483649L;
      this.u9 = "1000";
      this.c8 = 100.0F;
      this.t2 = 0.0F;
      this.s7 = 0.0F;
      this.x8 = false;
      this.n3 = -1;
      this.y4 = -1;
      this.e2 = -1;
      this.t4 = -1;
      this.q0 = -1;
      this.z3 = -1;
      this.m1 = 4294967295L;
      this.k7 = -1;
      this.m3 = -1;
      this.z8 = -1;
      this.j5 = Float.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != -1) {
         var2.l6("id", com.aspose.slides.ms.System.Xml.f4.n5(this.n5));
      }

      if (this.l6 != -2147483649L) {
         var2.l6("presetID", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      }

      if (this.k5 != -1) {
         var2.l6("presetClass", i8.n5(this.k5));
      }

      if (this.u3 != -2147483649L) {
         var2.l6("presetSubtype", com.aspose.slides.ms.System.Xml.f4.n5(this.u3));
      }

      if (this.a6 != null) {
         var2.l6("dur", this.a6);
      }

      if (!"1000".equals(this.u9)) {
         var2.l6("repeatCount", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("repeatDur", this.h0);
      }

      if (this.c8 != 100.0F) {
         if (var2.n5) {
            var2.l6("spd", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.c8), "%"}));
         } else {
            var2.l6(
               "spd", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.c8 * 1000.0F), 14))
            );
         }
      }

      if (this.t2 != 0.0F) {
         if (var2.n5) {
            var2.l6("accel", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.t2), "%"}));
         } else {
            var2.l6(
               "accel", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.t2 * 1000.0F), 14))
            );
         }
      }

      if (this.s7 != 0.0F) {
         if (var2.n5) {
            var2.l6("decel", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.s7), "%"}));
         } else {
            var2.l6(
               "decel", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.s7 * 1000.0F), 14))
            );
         }
      }

      if (this.x8) {
         var2.l6("autoRev", this.x8 ? "1" : "0");
      }

      if (this.n3 != -1) {
         var2.l6("restart", a4.n5(this.n3));
      }

      if (this.y4 != -1) {
         var2.l6("fill", b4.n5(this.y4));
      }

      if (this.e2 != -1) {
         var2.l6("syncBehavior", x3.n5(this.e2));
      }

      if (this.t9 != null) {
         var2.l6("tmFilter", this.t9);
      }

      if (this.z1 != null) {
         var2.l6("evtFilter", this.z1);
      }

      if (this.t4 != -1) {
         var2.l6("display", this.t4 == 1 ? "1" : "0");
      }

      if (this.q0 != -1) {
         var2.l6("masterRel", x5.n5(this.q0));
      }

      if (this.z3 != -1) {
         var2.l6("bldLvl", com.aspose.slides.ms.System.Xml.f4.n5(this.z3));
      }

      if ((this.m1 & 4294967295L) != 4294967295L) {
         var2.l6("grpId", com.aspose.slides.ms.System.Xml.f4.l6(this.m1));
      }

      if (this.k7 != -1) {
         var2.l6("afterEffect", this.k7 == 1 ? "1" : "0");
      }

      if (this.m3 != -1) {
         var2.l6("nodeType", b2.n5(this.m3));
      }

      if (this.z8 != -1) {
         var2.l6("nodePh", this.z8 == 1 ? "1" : "0");
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.j5)) {
         if (var2.n5) {
            var2.l6("p14:presetBounceEnd", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.j5), "%"}));
         } else {
            var2.l6(
               "p14:presetBounceEnd",
               com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.j5 * 1000.0F), 14))
            );
         }
      }

      if (this.w1 != null) {
         this.w1.n5("p", var2, "stCondLst");
      }

      if (this.r4 != null) {
         this.r4.n5("p", var2, "endCondLst");
      }

      if (this.c4 != null) {
         this.c4.n5("p", var2, "endSync");
      }

      if (this.y2 != null) {
         this.y2.n5("p", var2, "iterate");
      }

      if (this.y1 != null) {
         this.y1.n5("p", var2, "childTnLst");
      }

      if (this.a0 != null) {
         this.a0.n5("p", var2, "subTnLst");
      }

      var2.s7();
   }

   public final z2x n5() {
      if (this.w1 != null) {
         throw new Exception("Only one <stCondLst> element can be added.");
      }

      this.w1 = new z2x();
      return this.w1;
   }

   public final z2x l6() {
      if (this.r4 != null) {
         throw new Exception("Only one <endCondLst> element can be added.");
      }

      this.r4 = new z2x();
      return this.r4;
   }

   public final d1x k5() {
      if (this.c4 != null) {
         throw new Exception("Only one <endSync> element can be added.");
      }

      this.c4 = new d1x();
      return this.c4;
   }

   public final b6z u3() {
      if (this.y2 != null) {
         throw new Exception("Only one <iterate> element can be added.");
      }

      this.y2 = new b6z();
      return this.y2;
   }

   public final h7e a6() {
      if (this.y1 != null) {
         throw new Exception("Only one <childTnLst> element can be added.");
      }

      this.y1 = new h7e();
      return this.y1;
   }

   public final void n5(h7e var1) {
      this.a0 = var1;
   }

   public final int u9() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final long h0() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   public final byte c8() {
      return this.k5;
   }

   public final void n5(byte var1) {
      this.k5 = var1;
   }

   public final long t2() {
      return this.u3;
   }

   public final void l6(long var1) {
      this.u3 = var1;
   }

   public final String s7() {
      return this.a6;
   }

   public final void n5(String var1) {
      this.a6 = var1;
   }

   public final String x8() {
      return this.u9;
   }

   public final void l6(String var1) {
      this.u9 = var1;
   }

   public final String n3() {
      return this.h0;
   }

   public final void k5(String var1) {
      this.h0 = var1;
   }

   public final float y4() {
      return this.c8;
   }

   public final void n5(float var1) {
      this.c8 = var1;
   }

   public final float e2() {
      return this.t2;
   }

   public final void l6(float var1) {
      this.t2 = var1;
   }

   public final float t9() {
      return this.s7;
   }

   public final void k5(float var1) {
      this.s7 = var1;
   }

   public final boolean z1() {
      return this.x8;
   }

   public final void n5(boolean var1) {
      this.x8 = var1;
   }

   public final byte t4() {
      return this.n3;
   }

   public final void l6(byte var1) {
      this.n3 = var1;
   }

   public final byte q0() {
      return this.y4;
   }

   public final void k5(byte var1) {
      this.y4 = var1;
   }

   public final String z3() {
      return this.t9;
   }

   public final void u3(String var1) {
      this.t9 = var1;
   }

   public final String m1() {
      return this.z1;
   }

   public final void a6(String var1) {
      this.z1 = var1;
   }

   public final byte k7() {
      return this.t4;
   }

   public final void u3(byte var1) {
      this.t4 = var1;
   }

   public final byte m3() {
      return this.q0;
   }

   public final void a6(byte var1) {
      this.q0 = var1;
   }

   public final long z8() {
      return this.m1;
   }

   public final void k5(long var1) {
      this.m1 = var1;
   }

   public final byte j5() {
      return this.k7;
   }

   public final void u9(byte var1) {
      this.k7 = var1;
   }

   public final byte w1() {
      return this.m3;
   }

   public final void h0(byte var1) {
      this.m3 = var1;
   }

   public final byte r4() {
      return this.z8;
   }

   public final void c8(byte var1) {
      this.z8 = var1;
   }

   public final z2x c4() {
      return this.w1;
   }

   public final z2x y2() {
      return this.r4;
   }

   public final d1x y1() {
      return this.c4;
   }

   public final b6z a0() {
      return this.y2;
   }

   public final h7e d2() {
      return this.y1;
   }

   public final h7e d5() {
      return this.a0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 s3() {
      return d2;
   }

   // $VF: synthetic method
   static int n5(n0d var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long n5(n0d var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static byte n5(n0d var0, byte var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static long l6(n0d var0, long var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String n5(n0d var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String l6(n0d var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String k5(n0d var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static float n5(n0d var0, float var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static float l6(n0d var0, float var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static float k5(n0d var0, float var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static boolean n5(n0d var0, boolean var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static byte l6(n0d var0, byte var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static byte k5(n0d var0, byte var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static byte u3(n0d var0, byte var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String u3(n0d var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String a6(n0d var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static byte a6(n0d var0, byte var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static byte u9(n0d var0, byte var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static int l6(n0d var0, int var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static long k5(n0d var0, long var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static byte h0(n0d var0, byte var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static byte c8(n0d var0, byte var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static byte t2(n0d var0, byte var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static float u3(n0d var0, float var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static z2x n5(n0d var0, z2x var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static z2x l6(n0d var0, z2x var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static d1x n5(n0d var0, d1x var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static b6z n5(n0d var0, b6z var1) {
      return var0.y2 = var1;
   }

   // $VF: synthetic method
   static h7e n5(n0d var0, h7e var1) {
      return var0.y1 = var1;
   }

   // $VF: synthetic method
   static h7e l6(n0d var0, h7e var1) {
      return var0.a0 = var1;
   }
}
