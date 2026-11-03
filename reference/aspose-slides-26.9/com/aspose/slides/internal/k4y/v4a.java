package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class v4a extends m1 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private String s7;
   private int x8;
   private String n3;
   private int y4;
   private int e2;
   private int t9;
   private int z1;
   private int t4;
   private int q0;
   private int z3;
   private int m1;
   private int k7;
   private float m3;
   private int z8;
   private int j5;
   private int w1;
   private int r4;
   private String c4;
   private String y2;
   private String y1;
   private String a0;
   private int d2;
   private int d5;
   private int s3;
   private int p8;
   private String f2;
   private int i1;
   private String e5;
   private String b3;
   private int o0;
   private String z7;
   private String v4;
   private int u6;
   private float t1;
   private int a5;
   private int h2;
   private int v0;
   private int f0;
   private int a3;
   private int p3;
   private int x9;
   private int y0;
   private int j9;
   private int z6;
   private String e9;
   private String o5;
   private String j8;
   private l6m w2;
   private String s0;
   private List<g7> v8;
   private static final com.aspose.slides.internal.v6g.u9 v3 = new com.aspose.slides.internal.v6g.u9(
      "id",
      "style",
      "href",
      "target",
      "class",
      "title",
      "alt",
      "coordsize",
      "coordorigin",
      "wrapcoords",
      "print",
      "o:spid",
      "o:oned",
      "o:regroupid",
      "o:doubleclicknotify",
      "o:button",
      "o:userhidden",
      "o:bullet",
      "o:hr",
      "o:hrstd",
      "o:hrnoshade",
      "o:hrpct",
      "o:hralign",
      "o:allowincell",
      "o:allowoverlap",
      "o:userdrawn",
      "o:bordertopcolor",
      "o:borderleftcolor",
      "o:borderbottomcolor",
      "o:borderrightcolor",
      "o:dgmlayout",
      "o:dgmnodekind",
      "o:dgmlayoutmru",
      "o:insetmode",
      "chromakey",
      "filled",
      "fillcolor",
      "opacity",
      "stroked",
      "strokecolor",
      "strokeweight",
      "insetpen",
      "o:spt",
      "o:connectortype",
      "o:bwmode",
      "o:bwpure",
      "o:bwnormal",
      "o:forcedash",
      "o:oleicon",
      "o:ole",
      "o:preferrelative",
      "o:cliptowrap",
      "o:clip",
      "type",
      "adj",
      "path",
      "o:gfxdata",
      "equationxml",
      "formulas",
      "handles",
      "fill",
      "stroke",
      "shadow",
      "textbox",
      "textpath",
      "imagedata",
      "skew",
      "extrusion",
      "callout",
      "lock",
      "clippath",
      "signatureline",
      "wrap",
      "anchorlock",
      "bordertop",
      "borderbottom",
      "borderleft",
      "borderright",
      "ClientData",
      "textdata",
      "recolorinfo",
      "ink",
      "iscomment"
   );

   public v4a(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.m3();
      v4a$1 var2 = new v4a$1(this);
      n5(var1, var2);
      if (!var1.m1()) {
         String var3 = var1.n3();
         boolean var4 = false;

         while (var4 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var3)) {
               break;
            }

            var4 = false;
            if (var1.s7() == 1) {
               switch (v3.n5(var1.n3())) {
                  case 55:
                     t3k var5 = new t3k(var1);
                     this.v8.addItem(new g7("path", var5));
                     break;
                  case 56:
                  case 57:
                  default:
                     var1.r4();
                     var4 = true;
                     break;
                  case 58:
                     j2b var6 = new j2b(var1);
                     this.v8.addItem(new g7("formulas", var6));
                     break;
                  case 59:
                     r1k var7 = new r1k(var1);
                     this.v8.addItem(new g7("handles", var7));
                     break;
                  case 60:
                     e6k var8 = new e6k(var1);
                     this.v8.addItem(new g7("fill", var8));
                     break;
                  case 61:
                     d1n var9 = new d1n(var1);
                     this.v8.addItem(new g7("stroke", var9));
                     break;
                  case 62:
                     m8p var10 = new m8p(var1);
                     this.v8.addItem(new g7("shadow", var10));
                     break;
                  case 63:
                     t9x var11 = new t9x(var1);
                     this.v8.addItem(new g7("textbox", var11));
                     var4 = true;
                     break;
                  case 64:
                     u6v var12 = new u6v(var1);
                     this.v8.addItem(new g7("textpath", var12));
                     break;
                  case 65:
                     n9u var13 = new n9u(var1);
                     this.v8.addItem(new g7("imagedata", var13));
                     break;
                  case 66:
                     m2h var14 = new m2h(var1);
                     this.v8.addItem(new g7("skew", var14));
                     break;
                  case 67:
                     n6y var15 = new n6y(var1);
                     this.v8.addItem(new g7("extrusion", var15));
                     break;
                  case 68:
                     h4n var16 = new h4n(var1);
                     this.v8.addItem(new g7("callout", var16));
                     break;
                  case 69:
                     f1z var17 = new f1z(var1);
                     this.v8.addItem(new g7("lock", var17));
                     break;
                  case 70:
                     r6t var18 = new r6t(var1);
                     this.v8.addItem(new g7("clippath", var18));
                     break;
                  case 71:
                     z1f var19 = new z1f(var1);
                     this.v8.addItem(new g7("signatureline", var19));
                     break;
                  case 72:
                     e7i var20 = new e7i(var1);
                     this.v8.addItem(new g7("wrap", var20));
                     break;
                  case 73:
                     p7w var21 = new p7w(var1);
                     this.v8.addItem(new g7("anchorlock", var21));
                     break;
                  case 74:
                     v5d var22 = new v5d(var1);
                     this.v8.addItem(new g7("bordertop", var22));
                     break;
                  case 75:
                     v5d var23 = new v5d(var1);
                     this.v8.addItem(new g7("borderbottom", var23));
                     break;
                  case 76:
                     v5d var24 = new v5d(var1);
                     this.v8.addItem(new g7("borderleft", var24));
                     break;
                  case 77:
                     v5d var25 = new v5d(var1);
                     this.v8.addItem(new g7("borderright", var25));
                     break;
                  case 78:
                     y0w var26 = new y0w(var1);
                     this.v8.addItem(new g7("ClientData", var26));
                     var4 = true;
                     break;
                  case 79:
                     b3e var27 = new b3e(var1);
                     this.v8.addItem(new g7("textdata", var27));
                     break;
                  case 80:
                     e5f var28 = new e5f(var1);
                     this.v8.addItem(new g7("recolorinfo", var28));
                     break;
                  case 81:
                     q7p var29 = new q7p(var1);
                     this.v8.addItem(new g7("ink", var29));
                     break;
                  case 82:
                     s3z var30 = new s3z(var1);
                     this.v8.addItem(new g7("iscomment", var30));
               }
            }
         }
      }
   }

   public v4a() {
      this.m3();
   }

   private void m3() {
      this.x8 = 0;
      this.y4 = 0;
      this.e2 = 0;
      this.t9 = 0;
      this.z1 = 0;
      this.t4 = 0;
      this.q0 = 0;
      this.z3 = 0;
      this.m1 = 0;
      this.k7 = 0;
      this.m3 = Float.NaN;
      this.z8 = 0;
      this.j5 = 0;
      this.w1 = 0;
      this.r4 = 0;
      this.d2 = 0;
      this.d5 = 0;
      this.s3 = 0;
      this.p8 = 0;
      this.i1 = 0;
      this.o0 = 0;
      this.u6 = 0;
      this.t1 = Float.NaN;
      this.a5 = 0;
      this.h2 = 0;
      this.v0 = 0;
      this.f0 = 0;
      this.a3 = 0;
      this.p3 = 0;
      this.x9 = 0;
      this.y0 = 0;
      this.j9 = 0;
      this.z6 = 0;
      this.v8 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("id", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("style", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("href", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("target", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("class", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("title", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("alt", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("coordsize", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("coordorigin", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("wrapcoords", this.s7);
      }

      if (this.x8 != 0) {
         var2.l6("print", r5b.n5(this.x8));
      }

      if (this.n3 != null) {
         var2.l6("o:spid", this.n3);
      }

      if (this.y4 != 0) {
         var2.l6("o:oned", m4w.n5(this.y4));
      }

      if (this.e2 != 0) {
         var2.l6("o:regroupid", com.aspose.slides.ms.System.Xml.f4.n5(this.e2));
      }

      if (this.t9 != 0) {
         var2.l6("o:doubleclicknotify", m4w.n5(this.t9));
      }

      if (this.z1 != 0) {
         var2.l6("o:button", m4w.n5(this.z1));
      }

      if (this.t4 != 0) {
         var2.l6("o:userhidden", m4w.n5(this.t4));
      }

      if (this.q0 != 0) {
         var2.l6("o:bullet", m4w.n5(this.q0));
      }

      if (this.z3 != 0) {
         var2.l6("o:hr", m4w.n5(this.z3));
      }

      if (this.m1 != 0) {
         var2.l6("o:hrstd", m4w.n5(this.m1));
      }

      if (this.k7 != 0) {
         var2.l6("o:hrnoshade", m4w.n5(this.k7));
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.m3)) {
         var2.l6("o:hrpct", com.aspose.slides.ms.System.Xml.f4.n5(this.m3));
      }

      if (this.z8 != 0) {
         var2.l6("o:hralign", h5s.n5(this.z8));
      }

      if (this.j5 != 0) {
         var2.l6("o:allowincell", m4w.n5(this.j5));
      }

      if (this.w1 != 0) {
         var2.l6("o:allowoverlap", m4w.n5(this.w1));
      }

      if (this.r4 != 0) {
         var2.l6("o:userdrawn", m4w.n5(this.r4));
      }

      if (this.c4 != null) {
         var2.l6("o:bordertopcolor", this.c4);
      }

      if (this.y2 != null) {
         var2.l6("o:borderleftcolor", this.y2);
      }

      if (this.y1 != null) {
         var2.l6("o:borderbottomcolor", this.y1);
      }

      if (this.a0 != null) {
         var2.l6("o:borderrightcolor", this.a0);
      }

      if (this.d2 != 0) {
         var2.l6("o:dgmlayout", com.aspose.slides.ms.System.Xml.f4.n5(this.d2));
      }

      if (this.d5 != 0) {
         var2.l6("o:dgmnodekind", com.aspose.slides.ms.System.Xml.f4.n5(this.d5));
      }

      if (this.s3 != 0) {
         var2.l6("o:dgmlayoutmru", com.aspose.slides.ms.System.Xml.f4.n5(this.s3));
      }

      if (this.p8 != 0) {
         var2.l6("o:insetmode", u2p.n5(this.p8));
      }

      if (this.f2 != null) {
         var2.l6("chromakey", this.f2);
      }

      if (this.i1 != 0) {
         var2.l6("filled", r5b.n5(this.i1));
      }

      if (this.e5 != null) {
         var2.l6("fillcolor", this.e5);
      }

      if (this.b3 != null) {
         var2.l6("opacity", this.b3);
      }

      if (this.o0 != 0) {
         var2.l6("stroked", r5b.n5(this.o0));
      }

      if (this.z7 != null) {
         var2.l6("strokecolor", this.z7);
      }

      if (this.v4 != null) {
         var2.l6("strokeweight", this.v4);
      }

      if (this.u6 != 0) {
         var2.l6("insetpen", r5b.n5(this.u6));
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.t1)) {
         var2.l6("o:spt", com.aspose.slides.ms.System.Xml.f4.n5(this.t1));
      }

      if (this.a5 != 0) {
         var2.l6("o:connectortype", r8k.n5(this.a5));
      }

      if (this.h2 != 0) {
         var2.l6("o:bwmode", p6.n5(this.h2));
      }

      if (this.v0 != 0) {
         var2.l6("o:bwpure", p6.n5(this.v0));
      }

      if (this.f0 != 0) {
         var2.l6("o:bwnormal", p6.n5(this.f0));
      }

      if (this.a3 != 0) {
         var2.l6("o:forcedash", m4w.n5(this.a3));
      }

      if (this.p3 != 0) {
         var2.l6("o:oleicon", m4w.n5(this.p3));
      }

      if (this.x9 != 0) {
         var2.l6("o:ole", o6n.n5(this.x9));
      }

      if (this.y0 != 0) {
         var2.l6("o:preferrelative", m4w.n5(this.y0));
      }

      if (this.j9 != 0) {
         var2.l6("o:cliptowrap", m4w.n5(this.j9));
      }

      if (this.z6 != 0) {
         var2.l6("o:clip", m4w.n5(this.z6));
      }

      if (this.e9 != null) {
         var2.l6("type", this.e9);
      }

      if (this.o5 != null) {
         var2.l6("adj", this.o5);
      }

      if (this.j8 != null) {
         var2.l6("path", this.j8);
      }

      if (this.w2 != null) {
         var2.l6("o:gfxdata", this.w2.n5());
      }

      if (this.s0 != null) {
         var2.l6("equationxml", this.s0);
      }

      List$Enumerator var4 = this.v8.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (v3.n5(var5.n5())) {
               case 55:
                  ((t3k)var5.k5()).n5("v", var2, var5.n5());
               case 56:
               case 57:
               default:
                  break;
               case 58:
                  ((j2b)var5.k5()).n5("v", var2, var5.n5());
                  break;
               case 59:
                  ((r1k)var5.k5()).n5("v", var2, var5.n5());
                  break;
               case 60:
                  ((e6k)var5.k5()).n5("v", var2, var5.n5());
                  break;
               case 61:
                  ((d1n)var5.k5()).n5("v", var2, var5.n5());
                  break;
               case 62:
                  ((m8p)var5.k5()).n5("v", var2, var5.n5());
                  break;
               case 63:
                  ((t9x)var5.k5()).n5("v", var2, var5.n5());
                  break;
               case 64:
                  ((u6v)var5.k5()).n5("v", var2, var5.n5());
                  break;
               case 65:
                  ((n9u)var5.k5()).n5("v", var2, var5.n5());
                  break;
               case 66:
                  ((m2h)var5.k5()).n5("o", var2, var5.n5());
                  break;
               case 67:
                  ((n6y)var5.k5()).n5("o", var2, var5.n5());
                  break;
               case 68:
                  ((h4n)var5.k5()).n5("o", var2, var5.n5());
                  break;
               case 69:
                  ((f1z)var5.k5()).n5("o", var2, var5.n5());
                  break;
               case 70:
                  ((r6t)var5.k5()).n5("o", var2, var5.n5());
                  break;
               case 71:
                  ((z1f)var5.k5()).n5("o", var2, var5.n5());
                  break;
               case 72:
                  ((e7i)var5.k5()).n5("wvml", var2, var5.n5());
                  break;
               case 73:
                  ((p7w)var5.k5()).n5("wvml", var2, var5.n5());
                  break;
               case 74:
                  ((v5d)var5.k5()).n5("wvml", var2, var5.n5());
                  break;
               case 75:
                  ((v5d)var5.k5()).n5("wvml", var2, var5.n5());
                  break;
               case 76:
                  ((v5d)var5.k5()).n5("wvml", var2, var5.n5());
                  break;
               case 77:
                  ((v5d)var5.k5()).n5("wvml", var2, var5.n5());
                  break;
               case 78:
                  ((y0w)var5.k5()).n5("x", var2, var5.n5());
                  break;
               case 79:
                  ((b3e)var5.k5()).n5("ppt", var2, var5.n5());
                  break;
               case 80:
                  ((e5f)var5.k5()).n5("ppt", var2, var5.n5());
                  break;
               case 81:
                  ((q7p)var5.k5()).n5("o", var2, var5.n5());
                  break;
               case 82:
                  ((s3z)var5.k5()).n5("ppt", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   @Override
   public g7 u9(String var1) {
      g7 var2;
      switch (v3.n5(var1)) {
         case 55:
            var2 = new g7("path", new t3k());
            break;
         case 56:
         case 57:
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
         case 58:
            var2 = new g7("formulas", new j2b());
            break;
         case 59:
            var2 = new g7("handles", new r1k());
            break;
         case 60:
            var2 = new g7("fill", new e6k());
            break;
         case 61:
            var2 = new g7("stroke", new d1n());
            break;
         case 62:
            var2 = new g7("shadow", new m8p());
            break;
         case 63:
            var2 = new g7("textbox", new t9x());
            break;
         case 64:
            var2 = new g7("textpath", new u6v());
            break;
         case 65:
            var2 = new g7("imagedata", new n9u());
            break;
         case 66:
            var2 = new g7("skew", new m2h());
            break;
         case 67:
            var2 = new g7("extrusion", new n6y());
            break;
         case 68:
            var2 = new g7("callout", new h4n());
            break;
         case 69:
            var2 = new g7("lock", new f1z());
            break;
         case 70:
            var2 = new g7("clippath", new r6t());
            break;
         case 71:
            var2 = new g7("signatureline", new z1f());
            break;
         case 72:
            var2 = new g7("wrap", new e7i());
            break;
         case 73:
            var2 = new g7("anchorlock", new p7w());
            break;
         case 74:
            var2 = new g7("bordertop", new v5d());
            break;
         case 75:
            var2 = new g7("borderbottom", new v5d());
            break;
         case 76:
            var2 = new g7("borderleft", new v5d());
            break;
         case 77:
            var2 = new g7("borderright", new v5d());
            break;
         case 78:
            var2 = new g7("ClientData", new y0w());
            break;
         case 79:
            var2 = new g7("textdata", new b3e());
            break;
         case 80:
            var2 = new g7("recolorinfo", new e5f());
            break;
         case 81:
            var2 = new g7("ink", new q7p());
            break;
         case 82:
            var2 = new g7("iscomment", new s3z());
      }

      this.v8.addItem(var2);
      return var2;
   }

   public final void n5(g7 var1) {
      this.v8.addItem(var1);
   }

   @Override
   public String n5() {
      return this.n5;
   }

   @Override
   public void l6(String var1) {
      this.n5 = var1;
   }

   @Override
   public String l6() {
      return this.l6;
   }

   @Override
   public void k5(String var1) {
      this.l6 = var1;
   }

   @Override
   public String k5() {
      return this.c8;
   }

   @Override
   public String u3() {
      return this.t2;
   }

   public String m1() {
      return this.n3;
   }

   @Override
   public void u3(String var1) {
      this.n3 = var1;
   }

   @Override
   public int a6() {
      return this.d2;
   }

   @Override
   public void n5(int var1) {
      this.d2 = var1;
   }

   @Override
   public int u9() {
      return this.d5;
   }

   @Override
   public void l6(int var1) {
      this.d5 = var1;
   }

   @Override
   public int h0() {
      return this.i1;
   }

   @Override
   public void k5(int var1) {
      this.i1 = var1;
   }

   @Override
   public String c8() {
      return this.e5;
   }

   @Override
   public void a6(String var1) {
      this.e5 = var1;
   }

   @Override
   public int x8() {
      return this.o0;
   }

   @Override
   public void a6(int var1) {
      this.o0 = var1;
   }

   @Override
   public String n3() {
      return this.z7;
   }

   @Override
   public void h0(String var1) {
      this.z7 = var1;
   }

   @Override
   public String y4() {
      return this.v4;
   }

   @Override
   public void c8(String var1) {
      this.v4 = var1;
   }

   @Override
   public float e2() {
      return this.t1;
   }

   @Override
   public void n5(float var1) {
      this.t1 = var1;
   }

   @Override
   public void u9(int var1) {
      this.a5 = var1;
   }

   @Override
   public void h0(int var1) {
      this.y0 = var1;
   }

   @Override
   public String t4() {
      return this.e9;
   }

   @Override
   public void x8(String var1) {
      this.e9 = var1;
   }

   @Override
   public String q0() {
      return this.o5;
   }

   @Override
   public void n3(String var1) {
      this.o5 = var1;
   }

   @Override
   public String z3() {
      return this.j8;
   }

   @Override
   public void y4(String var1) {
      this.j8 = var1;
   }

   @Override
   public List<g7> t2() {
      return this.v8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k7() {
      return v3;
   }

   // $VF: synthetic method
   static String n5(v4a var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(v4a var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(v4a var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(v4a var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(v4a var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u9(v4a var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String h0(v4a var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String c8(v4a var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String t2(v4a var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String s7(v4a var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static int n5(v4a var0, int var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String x8(v4a var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static int l6(v4a var0, int var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static int k5(v4a var0, int var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static int u3(v4a var0, int var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static int a6(v4a var0, int var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static int u9(v4a var0, int var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static int h0(v4a var0, int var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static int c8(v4a var0, int var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static int t2(v4a var0, int var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static int s7(v4a var0, int var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static float n5(v4a var0, float var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static int x8(v4a var0, int var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static int n3(v4a var0, int var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static int y4(v4a var0, int var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static int e2(v4a var0, int var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static String n3(v4a var0, String var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static String y4(v4a var0, String var1) {
      return var0.y2 = var1;
   }

   // $VF: synthetic method
   static String e2(v4a var0, String var1) {
      return var0.y1 = var1;
   }

   // $VF: synthetic method
   static String t9(v4a var0, String var1) {
      return var0.a0 = var1;
   }

   // $VF: synthetic method
   static int t9(v4a var0, int var1) {
      return var0.d2 = var1;
   }

   // $VF: synthetic method
   static int z1(v4a var0, int var1) {
      return var0.d5 = var1;
   }

   // $VF: synthetic method
   static int t4(v4a var0, int var1) {
      return var0.s3 = var1;
   }

   // $VF: synthetic method
   static int q0(v4a var0, int var1) {
      return var0.p8 = var1;
   }

   // $VF: synthetic method
   static String z1(v4a var0, String var1) {
      return var0.f2 = var1;
   }

   // $VF: synthetic method
   static int z3(v4a var0, int var1) {
      return var0.i1 = var1;
   }

   // $VF: synthetic method
   static String t4(v4a var0, String var1) {
      return var0.e5 = var1;
   }

   // $VF: synthetic method
   static String q0(v4a var0, String var1) {
      return var0.b3 = var1;
   }

   // $VF: synthetic method
   static int m1(v4a var0, int var1) {
      return var0.o0 = var1;
   }

   // $VF: synthetic method
   static String z3(v4a var0, String var1) {
      return var0.z7 = var1;
   }

   // $VF: synthetic method
   static String m1(v4a var0, String var1) {
      return var0.v4 = var1;
   }

   // $VF: synthetic method
   static int k7(v4a var0, int var1) {
      return var0.u6 = var1;
   }

   // $VF: synthetic method
   static float l6(v4a var0, float var1) {
      return var0.t1 = var1;
   }

   // $VF: synthetic method
   static int m3(v4a var0, int var1) {
      return var0.a5 = var1;
   }

   // $VF: synthetic method
   static int z8(v4a var0, int var1) {
      return var0.h2 = var1;
   }

   // $VF: synthetic method
   static int j5(v4a var0, int var1) {
      return var0.v0 = var1;
   }

   // $VF: synthetic method
   static int w1(v4a var0, int var1) {
      return var0.f0 = var1;
   }

   // $VF: synthetic method
   static int r4(v4a var0, int var1) {
      return var0.a3 = var1;
   }

   // $VF: synthetic method
   static int c4(v4a var0, int var1) {
      return var0.p3 = var1;
   }

   // $VF: synthetic method
   static int y2(v4a var0, int var1) {
      return var0.x9 = var1;
   }

   // $VF: synthetic method
   static int y1(v4a var0, int var1) {
      return var0.y0 = var1;
   }

   // $VF: synthetic method
   static int a0(v4a var0, int var1) {
      return var0.j9 = var1;
   }

   // $VF: synthetic method
   static int d2(v4a var0, int var1) {
      return var0.z6 = var1;
   }

   // $VF: synthetic method
   static String k7(v4a var0, String var1) {
      return var0.e9 = var1;
   }

   // $VF: synthetic method
   static String m3(v4a var0, String var1) {
      return var0.o5 = var1;
   }

   // $VF: synthetic method
   static String z8(v4a var0, String var1) {
      return var0.j8 = var1;
   }

   // $VF: synthetic method
   static l6m n5(v4a var0, l6m var1) {
      return var0.w2 = var1;
   }

   // $VF: synthetic method
   static String j5(v4a var0, String var1) {
      return var0.s0 = var1;
   }
}
