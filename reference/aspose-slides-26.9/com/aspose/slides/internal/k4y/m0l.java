package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class m0l extends b3 {
   private byte n5;
   private String l6;
   private String k5;
   private float u3;
   private byte a6;
   private byte u9;
   private byte h0;
   private byte c8;
   private float t2;
   private byte s7;
   private float x8;
   private byte n3;
   private float y4;
   private byte e2;
   private boolean t9;
   private boolean z1;
   private boolean t4;
   private long q0;
   private String z3;
   private r5w m1;
   private g7 k7;
   private g7 m3;
   private z4 z8;
   private g7 j5;
   private g7 w1;
   private q5v r4;
   private q5v c4;
   private q5v y2;
   private q5v y1;
   private x6s a0;
   private x6s d2;
   private l8r d5;
   private static final com.aspose.slides.internal.v6g.u9 s3 = new com.aspose.slides.internal.v6g.u9(
      "kumimoji",
      "lang",
      "altLang",
      "sz",
      "b",
      "i",
      "u",
      "strike",
      "kern",
      "cap",
      "spc",
      "normalizeH",
      "baseline",
      "noProof",
      "dirty",
      "err",
      "smtClean",
      "smtId",
      "bmk",
      "ln",
      "noFill",
      "solidFill",
      "gradFill",
      "blipFill",
      "pattFill",
      "grpFill",
      "effectLst",
      "effectDag",
      "highlight",
      "uLnTx",
      "uLn",
      "uFillTx",
      "uFill",
      "latin",
      "ea",
      "cs",
      "sym",
      "hlinkClick",
      "hlinkMouseOver",
      "extLst"
   );

   public m0l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.z7();
      m0l$1 var2 = new m0l$1(this);
      n5(var1, var2);
      n5(var1, new m0l$2(this, var1));
   }

   public m0l() {
      this.z7();
   }

   private void z7() {
      this.n5 = -1;
      this.u3 = Float.NaN;
      this.a6 = -1;
      this.u9 = -1;
      this.h0 = -1;
      this.c8 = -1;
      this.t2 = Float.NaN;
      this.s7 = -1;
      this.x8 = Float.NaN;
      this.n3 = -1;
      this.y4 = Float.NaN;
      this.e2 = -1;
      this.t9 = true;
      this.z1 = false;
      this.t4 = true;
      this.q0 = 0L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != -1) {
         var2.l6("kumimoji", this.n5 == 1 ? "1" : "0");
      }

      if (this.l6 != null) {
         var2.l6("lang", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("altLang", this.k5);
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.u3)) {
         var2.l6("sz", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.u3 * 100.0F), 14)));
      }

      if (this.a6 != -1) {
         var2.l6("b", this.a6 == 1 ? "1" : "0");
      }

      if (this.u9 != -1) {
         var2.l6("i", this.u9 == 1 ? "1" : "0");
      }

      if (this.h0 != -1) {
         var2.l6("u", n0.n5(this.h0));
      }

      if (this.c8 != -1) {
         var2.l6("strike", c7.n5(this.c8));
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.t2)) {
         var2.l6("kern", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.t2 * 100.0F), 14)));
      }

      if (this.s7 != -1) {
         var2.l6("cap", k6.n5(this.s7));
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.x8)) {
         var2.l6("spc", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.x8 * 100.0F), 14)));
      }

      if (this.n3 != -1) {
         var2.l6("normalizeH", this.n3 == 1 ? "1" : "0");
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.y4)) {
         if (var2.n5) {
            var2.l6("baseline", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.y4), "%"}));
         } else {
            var2.l6(
               "baseline",
               com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.y4 * 1000.0F), 14))
            );
         }
      }

      if (this.e2 != -1) {
         var2.l6("noProof", this.e2 == 1 ? "1" : "0");
      }

      if (!this.t9) {
         var2.l6("dirty", this.t9 ? "1" : "0");
      }

      if (this.z1) {
         var2.l6("err", this.z1 ? "1" : "0");
      }

      if (!this.t4) {
         var2.l6("smtClean", this.t4 ? "1" : "0");
      }

      if ((this.q0 & 4294967295L) != 0L) {
         var2.l6("smtId", com.aspose.slides.ms.System.Xml.f4.l6(this.q0));
      }

      if (this.z3 != null) {
         var2.l6("bmk", this.z3);
      }

      if (this.m1 != null) {
         this.m1.n5("a", var2, "ln");
      }

      if (this.k7 != null) {
         switch (s3.n5(this.k7.n5())) {
            case 20:
               ((u4k)this.k7.k5()).n5("a", var2, this.k7.n5());
               break;
            case 21:
               ((e2l)this.k7.k5()).n5("a", var2, this.k7.n5());
               break;
            case 22:
               ((j2p)this.k7.k5()).n5("a", var2, this.k7.n5());
               break;
            case 23:
               ((e3)this.k7.k5()).n5("a", var2, this.k7.n5());
               break;
            case 24:
               ((n9q)this.k7.k5()).n5("a", var2, this.k7.n5());
               break;
            case 25:
               ((r6i)this.k7.k5()).n5("a", var2, this.k7.n5());
         }
      }

      if (this.m3 != null) {
         switch (s3.n5(this.m3.n5())) {
            case 26:
               ((o9b)this.m3.k5()).n5("a", var2, this.m3.n5());
               break;
            case 27:
               ((f8y)this.m3.k5()).n5("a", var2, this.m3.n5());
         }
      }

      if (this.z8 != null) {
         this.z8.n5("a", var2, "highlight");
      }

      if (this.j5 != null) {
         switch (s3.n5(this.j5.n5())) {
            case 29:
               ((a2p)this.j5.k5()).n5("a", var2, this.j5.n5());
               break;
            case 30:
               ((r5w)this.j5.k5()).n5("a", var2, this.j5.n5());
         }
      }

      if (this.w1 != null) {
         switch (s3.n5(this.w1.n5())) {
            case 31:
               ((b7s)this.w1.k5()).n5("a", var2, this.w1.n5());
               break;
            case 32:
               ((n5p)this.w1.k5()).n5("a", var2, this.w1.n5());
         }
      }

      if (this.r4 != null) {
         this.r4.n5("a", var2, "latin");
      }

      if (this.c4 != null) {
         this.c4.n5("a", var2, "ea");
      }

      if (this.y2 != null) {
         this.y2.n5("a", var2, "cs");
      }

      if (this.y1 != null) {
         this.y1.n5("a", var2, "sym");
      }

      if (this.a0 != null) {
         this.a0.n5("a", var2, "hlinkClick");
      }

      if (this.d2 != null) {
         this.d2.n5("a", var2, "hlinkMouseOver");
      }

      if (this.d5 != null) {
         this.d5.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final r5w n5() {
      if (this.m1 != null) {
         throw new Exception("Only one <ln> element can be added.");
      }

      this.m1 = new r5w();
      return this.m1;
   }

   public final z4 l6() {
      if (this.z8 != null) {
         throw new Exception("Only one <highlight> element can be added.");
      }

      this.z8 = new z4();
      return this.z8;
   }

   public final q5v k5() {
      if (this.r4 != null) {
         throw new Exception("Only one <latin> element can be added.");
      }

      this.r4 = new q5v();
      return this.r4;
   }

   public final q5v u3() {
      if (this.c4 != null) {
         throw new Exception("Only one <ea> element can be added.");
      }

      this.c4 = new q5v();
      return this.c4;
   }

   public final q5v a6() {
      if (this.y2 != null) {
         throw new Exception("Only one <cs> element can be added.");
      }

      this.y2 = new q5v();
      return this.y2;
   }

   public final q5v u9() {
      if (this.y1 != null) {
         throw new Exception("Only one <sym> element can be added.");
      }

      this.y1 = new q5v();
      return this.y1;
   }

   public final x6s h0() {
      if (this.a0 != null) {
         throw new Exception("Only one <hlinkClick> element can be added.");
      }

      this.a0 = new x6s();
      return this.a0;
   }

   public final x6s c8() {
      if (this.d2 != null) {
         throw new Exception("Only one <hlinkMouseOver> element can be added.");
      }

      this.d2 = new x6s();
      return this.d2;
   }

   public final g7 n5(String var1) {
      if (this.m3 != null) {
         throw new Exception("EffectProperties already is initialized.");
      }

      switch (s3.n5(var1)) {
         case 26:
            this.m3 = new g7("effectLst", new o9b());
            break;
         case 27:
            this.m3 = new g7("effectDag", new f8y());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.m3;
   }

   public final g7 l6(String var1) {
      if (this.k7 != null) {
         throw new Exception("FillProperties already is initialized.");
      }

      switch (s3.n5(var1)) {
         case 20:
            this.k7 = new g7("noFill", new u4k());
            break;
         case 21:
            this.k7 = new g7("solidFill", new e2l());
            break;
         case 22:
            this.k7 = new g7("gradFill", new j2p());
            break;
         case 23:
            this.k7 = new g7("blipFill", new e3());
            break;
         case 24:
            this.k7 = new g7("pattFill", new n9q());
            break;
         case 25:
            this.k7 = new g7("grpFill", new r6i());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.k7;
   }

   public final g7 k5(String var1) {
      if (this.w1 != null) {
         throw new Exception("TextUnderlineFill already is initialized.");
      }

      switch (s3.n5(var1)) {
         case 31:
            this.w1 = new g7("uFillTx", new b7s());
            break;
         case 32:
            this.w1 = new g7("uFill", new n5p());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.w1;
   }

   public final g7 u3(String var1) {
      if (this.j5 != null) {
         throw new Exception("TextUnderlineLine already is initialized.");
      }

      switch (s3.n5(var1)) {
         case 29:
            this.j5 = new g7("uLnTx", new a2p());
            break;
         case 30:
            this.j5 = new g7("uLn", new r5w());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.j5;
   }

   public final byte t2() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public final String s7() {
      return this.l6;
   }

   public final void a6(String var1) {
      this.l6 = var1;
   }

   public final String x8() {
      return this.k5;
   }

   public final void u9(String var1) {
      this.k5 = var1;
   }

   public final float n3() {
      return this.u3;
   }

   public final void n5(float var1) {
      this.u3 = var1;
   }

   public final byte y4() {
      return this.a6;
   }

   public final void l6(byte var1) {
      this.a6 = var1;
   }

   public final byte e2() {
      return this.u9;
   }

   public final void k5(byte var1) {
      this.u9 = var1;
   }

   public final byte t9() {
      return this.h0;
   }

   public final void u3(byte var1) {
      this.h0 = var1;
   }

   public final byte z1() {
      return this.c8;
   }

   public final void a6(byte var1) {
      this.c8 = var1;
   }

   public final float t4() {
      return this.t2;
   }

   public final void l6(float var1) {
      this.t2 = var1;
   }

   public final byte q0() {
      return this.s7;
   }

   public final void u9(byte var1) {
      this.s7 = var1;
   }

   public final float z3() {
      return this.x8;
   }

   public final void k5(float var1) {
      this.x8 = var1;
   }

   public final byte m1() {
      return this.n3;
   }

   public final void h0(byte var1) {
      this.n3 = var1;
   }

   public final float k7() {
      return this.y4;
   }

   public final void u3(float var1) {
      this.y4 = var1;
   }

   public final byte m3() {
      return this.e2;
   }

   public final void c8(byte var1) {
      this.e2 = var1;
   }

   public final void n5(boolean var1) {
      this.t9 = var1;
   }

   public final boolean z8() {
      return this.z1;
   }

   public final void l6(boolean var1) {
      this.z1 = var1;
   }

   public final boolean j5() {
      return this.t4;
   }

   public final void k5(boolean var1) {
      this.t4 = var1;
   }

   public final long w1() {
      return this.q0;
   }

   public final void n5(long var1) {
      this.q0 = var1;
   }

   public final String r4() {
      return this.z3;
   }

   public final void h0(String var1) {
      this.z3 = var1;
   }

   public final r5w c4() {
      return this.m1;
   }

   public final g7 y2() {
      return this.k7;
   }

   public final g7 y1() {
      return this.m3;
   }

   public final z4 a0() {
      return this.z8;
   }

   public final g7 d2() {
      return this.j5;
   }

   public final g7 d5() {
      return this.w1;
   }

   public final q5v s3() {
      return this.r4;
   }

   public final q5v p8() {
      return this.c4;
   }

   public final q5v f2() {
      return this.y2;
   }

   public final q5v i1() {
      return this.y1;
   }

   public final x6s e5() {
      return this.a0;
   }

   public final x6s b3() {
      return this.d2;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 o0() {
      return s3;
   }

   // $VF: synthetic method
   static byte n5(m0l var0, byte var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(m0l var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(m0l var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static float n5(m0l var0, float var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static byte l6(m0l var0, byte var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static byte k5(m0l var0, byte var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static byte u3(m0l var0, byte var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static byte a6(m0l var0, byte var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static float l6(m0l var0, float var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static byte u9(m0l var0, byte var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static float k5(m0l var0, float var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static byte h0(m0l var0, byte var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static float u3(m0l var0, float var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static byte c8(m0l var0, byte var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static boolean n5(m0l var0, boolean var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static boolean l6(m0l var0, boolean var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static boolean k5(m0l var0, boolean var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static long n5(m0l var0, long var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static String k5(m0l var0, String var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static r5w n5(m0l var0, r5w var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static g7 n5(m0l var0, g7 var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static g7 l6(m0l var0, g7 var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static z4 n5(m0l var0, z4 var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static g7 k5(m0l var0, g7 var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static g7 u3(m0l var0, g7 var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static q5v n5(m0l var0, q5v var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static q5v l6(m0l var0, q5v var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static q5v k5(m0l var0, q5v var1) {
      return var0.y2 = var1;
   }

   // $VF: synthetic method
   static q5v u3(m0l var0, q5v var1) {
      return var0.y1 = var1;
   }

   // $VF: synthetic method
   static x6s n5(m0l var0, x6s var1) {
      return var0.a0 = var1;
   }

   // $VF: synthetic method
   static x6s l6(m0l var0, x6s var1) {
      return var0.d2 = var1;
   }

   // $VF: synthetic method
   static l8r n5(m0l var0, l8r var1) {
      return var0.d5 = var1;
   }
}
