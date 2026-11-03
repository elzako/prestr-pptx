package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

final class q4b extends e8v {
   private Dictionary<com.aspose.slides.internal.o9b.y1, String> e2 = new Dictionary<>();
   private String t9;
   private float z1 = 576.0F;
   private float t4;
   private SVGOptions q0;
   private a4w z3;
   private c3t m1;
   private boolean k7;
   private boolean m3;
   private boolean z8;
   private boolean j5;
   private boolean w1;
   private IHyperlink r4;
   private IHyperlink c4;
   private int y2;
   private int y1;
   private Dictionary<String, String> a0 = new Dictionary<>();
   private Dictionary<String, com.aspose.slides.internal.d0e.a6> d2 = new Dictionary<>();
   private Stack<com.aspose.slides.internal.d8v.u3> d5 = new Stack<>();
   private Stack<com.aspose.slides.internal.d0e.a6> s3 = new Stack<>();
   private List<com.aspose.slides.internal.d0e.a6> p8 = new List<>();
   private List<SvgTSpan> f2 = new List<>();
   private com.aspose.slides.ms.System.o5<com.aspose.slides.internal.o9b.w1> i1 = new com.aspose.slides.ms.System.o5<>();
   private TextParam e5;
   private s5v b3;
   private com.aspose.slides.internal.o9b.w1 o0 = com.aspose.slides.internal.o9b.w1.n5.u3();
   private int z7;
   private String v4;
   int s7;
   int x8;
   private boolean u6 = false;
   boolean n3;
   boolean y4;
   private boolean t1 = false;
   private static final Dictionary<Byte, float[]> a5 = new Dictionary<>();
   private final List<KeyValuePair<Shape, SvgShape>> h2 = new List<>();
   private static final com.aspose.slides.internal.n8e.e2 v0 = new com.aspose.slides.internal.n8e.e2(
      "onfocusin",
      "onfocusout",
      "onactivate",
      "onclick",
      "onmousedown",
      "onmouseup",
      "onmouseover",
      "onmousemove",
      "onmouseout",
      "onload",
      "onunload",
      "onabort",
      "onerror",
      "onresize",
      "onscroll",
      "onzoom",
      "onbegin",
      "onend",
      "onrepeat"
   );
   private static final Dictionary<String, Integer> f0 = new Dictionary<>();
   private static final Dictionary<String, Integer> a3 = new Dictionary<>();
   private static final Dictionary<String, Integer> p3 = new Dictionary<>();

   public q4b(int var1, int var2, float var3, float var4, float var5, SVGOptions var6, a4w var7) {
      super(var1, var2, var3, var4);
      this.n5(var3, var4, var5, var6, var7);
   }

   private void n5(float var1, float var2, float var3, SVGOptions var4, a4w var5) {
      this.n5(new com.aspose.slides.internal.w0.c8());
      if (var4 == null) {
         var4 = new SVGOptions();
      }

      if (var5 == null) {
         var5 = new a4w(new v3s());
      }

      this.z3 = var5;
      this.q0 = var4;
      this.k7 = this.m3 = this.z8 = false;
      this.s3 = new Stack<>();
      this.s3.push(new com.aspose.slides.internal.d8v.l6());
      this.z1 = var3;
      this.t4 = (float)(this.z1 / com.aspose.slides.ms.System.q1.z3((double)var1 * var2));
      this.t9 = "NoClip";
      this.e2.addItem(new com.aspose.slides.internal.o9b.y1(), this.t9);
      this.x8 = -1;
   }

   public final void n5(com.aspose.slides.internal.z0k.t4 var1, boolean var2) {
      this.w1();
      com.aspose.slides.internal.d8v.a6 var3 = this.l6();
      com.aspose.slides.internal.d8v.n5 var4 = this.z3.n5(this);
      if (var4.m1()) {
         var3.n5(var4);
      }

      com.aspose.slides.internal.d8v.l6 var5 = this.u3(var2);
      var3.n5(var5);
      com.aspose.slides.ms.System.Xml.k3 var6 = new com.aspose.slides.ms.System.Xml.k3(var1, com.aspose.slides.internal.l7h.j5.z3());
      var6.n5(1);
      this.n5(var6);
      com.aspose.slides.internal.n1n.u3.n5(var3, var6);
      var6.n5();
      var6.u9();
   }

   public final void n5(com.aspose.slides.internal.z0k.a0 var1, boolean var2) {
      this.w1();
      com.aspose.slides.ms.System.Xml.k3 var3 = new com.aspose.slides.ms.System.Xml.k3(var1);
      var3.n5(1);
      com.aspose.slides.internal.d8v.a6 var4 = this.l6();
      com.aspose.slides.internal.d8v.n5 var5 = this.z3.n5(this);
      if (var5.m1()) {
         var4.n5(var5);
      }

      com.aspose.slides.internal.d8v.l6 var6 = this.u3(var2);
      var4.n5(var6);
      com.aspose.slides.internal.n1n.u3.n5(var4, var3);
      var3.u9();
      this.z3.a6();
   }

   public final void n5() {
      this.s3.clear();
      this.s3.push(new com.aspose.slides.internal.d8v.l6());
      this.k7 = false;
      this.j5 = false;
      this.w1 = true;
   }

   final com.aspose.slides.internal.d8v.a6 l6() {
      com.aspose.slides.internal.d8v.a6 var1 = new com.aspose.slides.internal.d8v.a6();
      if (!this.d5()) {
         var1.u3(new com.aspose.slides.internal.b3z.a6(this.s7() / this.z1, 8));
         var1.a6(new com.aspose.slides.internal.b3z.a6(this.x8() / this.z1, 8));
      }

      var1.l6("slides-canvas");
      if (this.y4) {
         var1.l6(0);
      }

      var1.n5(new com.aspose.slides.internal.b3z.s7(0.0F, 0.0F, n5(this.s7() * this.c8() / this.z1), n5(this.x8() * this.t2() / this.z1)));
      if (this.x8 > -1) {
         var1.h0(com.aspose.slides.ms.System.d1.n5(new String[]{"Slide", com.aspose.slides.ms.System.a3.l6(this.x8)}));
      }

      return var1;
   }

   final void n5(com.aspose.slides.ms.System.Xml.l1 var1) {
      var1.l6(true);
      var1.n5("svg", "-//W3C//DTD SVG 1.1//EN", "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd", null);
   }

   final com.aspose.slides.internal.d8v.l6 u3(boolean var1) {
      com.aspose.slides.internal.d8v.l6 var2 = new com.aspose.slides.internal.d8v.l6();
      var2.k5(3);
      if (this.y4) {
         var2.l6(1);
      }

      var2.t2(
         com.aspose.slides.ms.System.d1.n5(
            "scale({0}, {1})",new Object[]{ com.aspose.slides.ms.System.Xml.f4.n5(this.c8() / this.z1), com.aspose.slides.ms.System.Xml.f4.n5(this.t2() / this.z1)
         })
      );
      com.aspose.slides.internal.d0e.a6 var3 = this.s3.pop();

      while (this.s3.size() > 0) {
         var3 = this.s3.pop();
      }

      for (int var4 = 0; var4 < var3.j5().n5(); var4++) {
         var2.n5(var3.j5().l6(var4));
      }

      return var2;
   }

   private void s3() {
      this.j5 = true;
      this.e5();
      this.p8();
   }

   private void p8() {
      if (!this.k7 && !this.m1.u3()) {
         com.aspose.slides.internal.d8v.l6 var1 = new com.aspose.slides.internal.d8v.l6();
         var1.t2(this.m1.k5());
         this.u3(var1);
         this.k7 = true;
      }
   }

   @Override
   protected com.aspose.slides.internal.w0.c8 n3() {
      return super.n3();
   }

   @Override
   protected void n5(com.aspose.slides.internal.w0.c8 var1) {
      super.n5(var1);
      this.m1 = new c3t(com.aspose.slides.internal.n8e.n1.l6(var1), 4);
   }

   @Override
   protected void h0() {
      this.f2();
      if (!this.c8.n5()
         && this.c8.u3() == 1.0F
         && this.c8.a6() == 0.0F
         && this.c8.u9() == 0.0F
         && this.c8.h0() == 1.0F
         && this.c8.c8() == 0.0F
         && this.c8.t2() == 0.0F) {
         this.c8 = new com.aspose.slides.internal.w0.c8();
      }

      super.h0();
   }

   private void f2() {
      if (this.k7) {
         this.w1();
         this.s3.pop();
      }

      this.k7 = false;
   }

   @Override
   public void n5(com.aspose.slides.internal.x4g.s7 var1, l6v var2, a1v var3) {
      boolean var4 = var2 != null && var2.u9();
      boolean var5 = var3 != null && var3.u3() != 0;
      a1v var6 = var3;
      if (var6 != null && !var5 && this.c4 != null) {
         var6 = new a1v(com.aspose.slides.internal.o9b.c8.e2().o8());
         var5 = true;
      }

      if (var4 || var5) {
         if (com.aspose.slides.internal.v6g.k5.l6(var6, q3d.class) && this.n5(var1, var2, (q3d)var6)) {
            q3d var16 = (q3d)var6;
            boolean var17 = this.n5(var16.w1());
            if (!var17 || !var16.t9().n5() && this.z1().getDeletePicturesCroppedAreas()) {
               this.n5(var16, var17);
            } else {
               this.n5(var16);
            }
         } else {
            String var7 = null;
            this.s3();
            com.aspose.slides.internal.x4g.s7 var8 = null;
            if (var4 && var2.l6() != 0) {
               var4 = false;
               var8 = (com.aspose.slides.internal.x4g.s7)var1.deepClone();
               com.aspose.slides.internal.o9b.m3 var9 = var2.q0();
               var8.n5(var9);
               var9.dispose();
            }

            com.aspose.slides.internal.l7h.a5 var18 = new com.aspose.slides.internal.l7h.a5();
            com.aspose.slides.internal.l7h.a5 var10 = new com.aspose.slides.internal.l7h.a5();
            float var11 = 0.0F;
            float var12 = 0.0F;
            if (var4 && var2.s7() != 0) {
               float[] var13 = new float[]{0.0F};
               this.z3.n5(this, var2, true, var13);
               var11 = var13[0];
               var11 *= (float)(var2.n5() * this.t4);
            }

            if (var4 && var2.x8() != 0) {
               float[] var21 = new float[]{0.0F};
               this.z3.n5(this, var2, false, var21);
               var12 = var21[0];
               var12 *= (float)(var2.n5() * this.t4);
            }

            if (var4 || var5) {
               com.aspose.slides.internal.n8e.i6.n5(var1, var18, var10, var11, var12, var2 != null ? (float)(var2.n5() * this.t4) : 0.0F, true);
               if (var18.l6() > 0) {
                  String var22 = var18.toString();
                  if (com.aspose.slides.internal.v6g.k5.l6(var6, u4z.class) && !this.q0.getDisableGradientSplit()) {
                     u4z var14 = (u4z)var6;
                     if (var14.e2() == 6 && var14.m3() == null || var14.e2() == 2 || var14.e2() == 3 || var14.e2() == 4 || var14.e2() == 5) {
                        String[] var15 = new String[]{var7};
                        this.n5(var14, var15);
                        var7 = var15[0];
                        var6 = null;
                     }
                  }

                  com.aspose.slides.internal.z9u.l6 var24 = new com.aspose.slides.internal.z9u.l6();
                  this.n5(var24);
                  this.n5(var24, var4 ? var2 : null, true, var6, var1);
                  var24.s7(var22);
                  if (!com.aspose.slides.ms.System.d1.n5(var7)) {
                     com.aspose.slides.internal.d0e.a6 var27;
                     if (!this.d2.containsKey(var7)) {
                        var27 = new com.aspose.slides.internal.z9u.l6();
                        var27.u9 = "clipPath";
                        var27.h0(var7);
                        this.d2.addItem(var7, var27);
                        this.k5(var27);
                     } else {
                        var27 = this.d2.get_Item(var7);
                     }

                     var27.n5(var24);
                  } else {
                     this.k5(var24);
                  }
               }

               if (var10.l6() > 0) {
                  String var23 = var10.toString();
                  if (com.aspose.slides.internal.v6g.k5.l6(var6, u4z.class) && !this.q0.getDisableGradientSplit()) {
                     u4z var25 = (u4z)var6;
                     if (var25.e2() == 6 && var25.m3() == null || var25.e2() == 2 || var25.e2() == 3 || var25.e2() == 4 || var25.e2() == 5) {
                        String[] var28 = new String[]{var7};
                        this.n5(var25, var28);
                        var7 = var28[0];
                        var6 = null;
                     }
                  }

                  com.aspose.slides.internal.z9u.l6 var26 = new com.aspose.slides.internal.z9u.l6();
                  this.n5(var26);
                  this.n5(var26, var4 ? var2 : null, false, var6, var1);
                  var26.s7(var23);
                  if (!com.aspose.slides.ms.System.d1.n5(var7)) {
                     com.aspose.slides.internal.d0e.a6 var29;
                     if (!this.d2.containsKey(var7)) {
                        var29 = new com.aspose.slides.internal.z9u.l6();
                        var29.u9 = "clipPath";
                        var29.h0(var7);
                        this.d2.addItem(var7, var29);
                        this.k5(var29);
                     } else {
                        var29 = this.d2.get_Item(var7);
                     }

                     var29.n5(var26);
                  } else {
                     this.k5(var26);
                  }
               }
            }

            if (var8 != null) {
               this.n5(var8, null, var2.u9);
            }
         }
      }
   }

   private void n5(q3d var1) {
      com.aspose.slides.internal.o9b.y1 var2 = var1.o0().y4();
      com.aspose.slides.internal.k9.u9 var3 = var1.c4();
      byte[] var4;
      if (var3 != null && var3.u3()) {
         var4 = var3.a6();
      } else {
         var4 = ((PPImage)var1.w1().getImage()).h0();
      }

      com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2(var4);

      try {
         com.aspose.slides.internal.c8m.y8 var6 = null;
         com.aspose.slides.internal.o9b.y2 var7 = new com.aspose.slides.internal.o9b.y2();
         com.aspose.slides.internal.c8m.y8[] var8 = new com.aspose.slides.internal.c8m.y8[]{var6};
         com.aspose.slides.internal.o9b.y2[] var9 = new com.aspose.slides.internal.o9b.y2[]{var7};
         PPImage.n5(var5, var8, var9);
         var6 = var8[0];
         var9[0].u3(var7);
         byte[] var10 = this.n5(var4, var6);
         this.n5(
            var1.t4(),
            var6 == null ? "" : var6.n5(),
            com.aspose.slides.internal.o9b.p8.n5(var7.h0()).a6(),
            var10,
            var2.y4(),
            com.aspose.slides.internal.o9b.y1.n5(var7).y4()
         );
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }
   }

   private void n5(q3d var1, boolean var2) {
      com.aspose.slides.internal.o9b.y1 var3 = var1.q0().y4();
      com.aspose.slides.internal.k9.u9 var4 = var1.c4();
      com.aspose.slides.internal.o9b.y1 var5 = var1.o0().y4();
      var5.k5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5((double)(var5.x8()), (short)((short)1)), 14));
      var5.u3(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5((double)(var5.n3()), (short)((short)1)), 14));
      if (var2 && !this.z1().getDeletePicturesCroppedAreas() && var4.u3()) {
         byte[] var67 = var1.r4();
         com.aspose.slides.internal.z0k.e2 var68 = new com.aspose.slides.internal.z0k.e2(var67);

         try {
            com.aspose.slides.internal.c8m.y8 var69 = null;
            com.aspose.slides.internal.o9b.y2 var71 = new com.aspose.slides.internal.o9b.y2();
            com.aspose.slides.internal.c8m.y8[] var72 = new com.aspose.slides.internal.c8m.y8[]{var69};
            com.aspose.slides.internal.o9b.y2[] var73 = new com.aspose.slides.internal.o9b.y2[]{var71};
            PPImage.n5(var68, var72, var73);
            var69 = var72[0];
            var73[0].u3(var71);
            byte[] var75 = this.n5(var67, var69);
            this.n5(var1.t4(), var69 == null ? "" : var69.n5(), com.aspose.slides.internal.o9b.p8.n5(var71.h0()).a6(), var75, var5.y4(), var3.y4());
         } finally {
            if (var68 != null) {
               var68.dispose();
            }
         }
      } else {
         com.aspose.slides.internal.o9b.y1 var7 = new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var3.s7(), var3.k5());
         var1.k5(var7.y4());
         com.aspose.slides.internal.o9b.y1[] var8 = new com.aspose.slides.internal.o9b.y1[]{var7};
         com.aspose.slides.internal.o9b.u6 var9 = d4.n5(var1, this, var8);
         var8[0].a6(var7);
         var1.l6(var7.y4());
         float var10 = 1.0F;
         com.aspose.slides.internal.o9b.p8 var11 = l6(var3.y4()).u3();
         if (n5(var1, var11.u3(), var9, var7.y4())) {
            float[] var12 = new float[]{1.0F};
            n5(var11.u3(), var9, var12).k5(var11);
            var10 = var12[0];
            var9.k5(var10, var10);
         }

         com.aspose.slides.internal.o9b.t4 var74 = var1.y1();
         int var13 = var74.s7();
         if (com.aspose.slides.internal.n8e.k7.k5(var74)) {
            var13 = 2498570;
         }

         com.aspose.slides.internal.o9b.l6 var14 = new com.aspose.slides.internal.o9b.l6(var11.l6(), var11.k5(), var13);

         byte[] var6;
         try {
            var14.n5();
            com.aspose.slides.internal.o9b.z1 var15 = com.aspose.slides.internal.o9b.z1.n5(var14);

            try {
               var15.c8(3);
               var15.a6(2);
               com.aspose.slides.internal.x4g.s7 var16 = new com.aspose.slides.internal.x4g.s7();
               var16.l6(new com.aspose.slides.internal.o9b.y1(var3.x8(), var3.n3(), var11.l6(), var11.k5()));
               float var17 = 1.0F / var9.c8().n5()[0];
               float var18 = 1.0F / var9.c8().n5()[3];
               if (var17 != 1.0F || var18 != 1.0F) {
                  var9.u3(var3.x8() * var17 * 2.0F, var3.n3() * var18 * 2.0F);
               }

               var15.n5(var9, var16);
            } finally {
               if (var15 != null) {
                  var15.dispose();
               }
            }

            int var77 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)var3.x8()), 14);
            int var80 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)var3.n3()), 14);
            com.aspose.slides.internal.o9b.l6 var82 = new com.aspose.slides.internal.o9b.l6(
               com.aspose.slides.internal.v6g.k5.u3(var3.s7() * var10, 13), com.aspose.slides.internal.v6g.k5.u3(var3.k5() * var10, 13)
            );

            try {
               var82.n5();
               com.aspose.slides.internal.o9b.y2 var19 = new com.aspose.slides.internal.o9b.y2(
                  var77, var80, com.aspose.slides.internal.v6g.k5.u3(var3.s7() * var10, 13), com.aspose.slides.internal.v6g.k5.u3(var3.k5() * var10, 13)
               );
               com.aspose.slides.internal.o9b.z1 var20 = com.aspose.slides.internal.o9b.z1.n5(var82);

               try {
                  var20.c8(3);
                  var20.a6(2);
                  var20.n5(var14, new com.aspose.slides.internal.o9b.y2(0, 0, var82.e2(), var82.h0()), var19.n3(), 2);
               } finally {
                  if (var20 != null) {
                     var20.dispose();
                  }
               }

               if ("image/jpeg".equals(var1.s3().getContentType())) {
                  var6 = this.n5(var82);
               } else {
                  var6 = com.aspose.slides.internal.n8e.k7.n5((com.aspose.slides.internal.o9b.t4)var82);
               }
            } finally {
               if (var82 != null) {
                  var82.dispose();
               }
            }
         } finally {
            if (var14 != null) {
               var14.dispose();
            }
         }

         com.aspose.slides.internal.z0k.e2 var76 = new com.aspose.slides.internal.z0k.e2(var6);

         try {
            com.aspose.slides.internal.c8m.y8 var78 = null;
            com.aspose.slides.internal.o9b.y2 var81 = new com.aspose.slides.internal.o9b.y2();
            com.aspose.slides.internal.c8m.y8[] var83 = new com.aspose.slides.internal.c8m.y8[]{var78};
            com.aspose.slides.internal.o9b.y2[] var84 = new com.aspose.slides.internal.o9b.y2[]{var81};
            PPImage.n5(var76, var83, var84);
            var78 = var83[0];
            var84[0].u3(var81);
            this.n5(
               var1.t4(), var78.n5(), com.aspose.slides.internal.o9b.p8.n5(var81.h0()).a6(), var6, var5.y4(), com.aspose.slides.internal.o9b.y1.n5(var81).y4()
            );
         } finally {
            if (var76 != null) {
               var76.dispose();
            }
         }
      }
   }

   private byte[] n5(byte[] var1, com.aspose.slides.internal.c8m.y8 var2) {
      if (var2 == null || !"image/jpeg".equals(var2.n5())) {
         return var1;
      }

      if (var1 != null && var1.length != 0) {
         com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2(var1);

         try {
            com.aspose.slides.internal.o9b.l6 var4 = new com.aspose.slides.internal.o9b.l6(var3);

            try {
               return this.n5(var4);
            } finally {
               if (var4 != null) {
                  var4.dispose();
               }
            }
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      } else {
         throw new ArgumentException("imageBytes cannot be null or empty");
      }
   }

   final byte[] n5(com.aspose.slides.internal.o9b.t4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("bitmap cannot be null");
      }

      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();

      try {
         com.aspose.slides.internal.j9e.h0 var3 = new com.aspose.slides.internal.j9e.h0(1);

         try {
            var3.n5()[0] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.a6, this.z1().getJpegQuality());
            var1.n5(var2, a4w.n5, var3);
            return var2.toArray();
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.y2 var1, l6v var2, a1v var3) {
      this.n5(var1.s7(), var1.x8(), var1.t2(), var1.l6(), var2, var3);
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.y1 var1, l6v var2, a1v var3) {
      this.n5(var1.x8(), var1.n3(), var1.s7(), var1.k5(), var2, var3);
   }

   private void n5(float var1, float var2, float var3, float var4, l6v var5, a1v var6) {
      boolean var7 = var5 != null && var5.u9();
      boolean var8 = var6 != null && var6.u3() != 0;
      if (var7 || var8) {
         this.s3();
         String var9 = null;
         if (var6 != null && com.aspose.slides.internal.v6g.k5.l6(var6, u4z.class) && !this.q0.getDisableGradientSplit()) {
            u4z var10 = (u4z)var6;
            if (var10.e2() == 6 && var10.m3() == null || var10.e2() == 2 || var10.e2() == 3 || var10.e2() == 4 || var10.e2() == 5) {
               String[] var11 = new String[]{var9};
               this.n5(var10, var11);
               var9 = var11[0];
               var6 = null;
            }
         }

         com.aspose.slides.internal.i1k.u9 var12 = new com.aspose.slides.internal.i1k.u9();
         if (com.aspose.slides.internal.v6g.k5.l6(var6, q3d.class)) {
            com.aspose.slides.internal.o9b.y1 var13 = com.aspose.slides.internal.v6g.k5.n5(var6, q3d.class).o0().y4();
            var12.l6(com.aspose.slides.internal.b3z.a6.k5(var13.x8()));
            var12.k5(com.aspose.slides.internal.b3z.a6.k5(var13.n3()));
            var12.u3(com.aspose.slides.internal.b3z.a6.k5(var13.s7()));
            var12.a6(com.aspose.slides.internal.b3z.a6.k5(var13.k5()));
         } else {
            var12.l6(com.aspose.slides.internal.b3z.a6.k5(var1));
            var12.k5(com.aspose.slides.internal.b3z.a6.k5(var2));
            var12.u3(com.aspose.slides.internal.b3z.a6.k5(var3));
            var12.a6(com.aspose.slides.internal.b3z.a6.k5(var4));
         }

         this.n5(var12, var5, true, var6, null);
         if (!com.aspose.slides.ms.System.d1.n5(var9)) {
            com.aspose.slides.internal.d0e.a6 var14;
            if (!this.d2.containsKey(var9)) {
               var14 = new com.aspose.slides.internal.z9u.l6();
               var14.u9 = "clipPath";
               var14.h0(var9);
               this.d2.addItem(var9, var14);
               this.k5(var14);
            } else {
               var14 = this.d2.get_Item(var9);
            }

            var14.n5(var12);
         } else {
            this.k5(var12);
         }
      }
   }

   private void n5(u4z var1, String[] var2) {
      String var3 = this.n5(var1);
      if (this.a0.containsKey(var3)) {
         var2[0] = this.a0.get_Item(var3);
      } else {
         String var4 = com.aspose.slides.ms.System.d1.n5("sp_", com.aspose.slides.ms.System.a3.l6(this.y1++));
         com.aspose.slides.internal.o9b.y1 var5 = var1.k7().n5(var1.o0().y4()).y4();
         d2k var6 = d2k.n5(var1.m1().n5, d2k.n5(var1.m1().l6, 2)).u3();
         if (var1.j5() == null && (var1.t9() != 2 || !(var6.l6 < 0.0F) && !(var6.l6 > 1.0F))) {
            new com.aspose.slides.internal.o9b.w1();
            com.aspose.slides.internal.o9b.w1 var7;
            com.aspose.slides.internal.o9b.w1[] var8;
            switch (var1.e2()) {
               case 2:
                  var8 = new com.aspose.slides.internal.o9b.w1[]{
                     new com.aspose.slides.internal.o9b.w1(var5.h0(), var5.t2()),
                     new com.aspose.slides.internal.o9b.w1(var5.h0(), var5.l6()),
                     new com.aspose.slides.internal.o9b.w1(var5.a6(), var5.l6())
                  };
                  var7 = new com.aspose.slides.internal.o9b.w1(var5.a6(), var5.t2());
                  break;
               case 3:
                  var8 = new com.aspose.slides.internal.o9b.w1[]{
                     new com.aspose.slides.internal.o9b.w1(var5.h0(), var5.l6()),
                     new com.aspose.slides.internal.o9b.w1(var5.a6(), var5.l6()),
                     new com.aspose.slides.internal.o9b.w1(var5.a6(), var5.t2())
                  };
                  var7 = new com.aspose.slides.internal.o9b.w1(var5.h0(), var5.t2());
                  break;
               case 4:
                  var8 = new com.aspose.slides.internal.o9b.w1[]{
                     new com.aspose.slides.internal.o9b.w1(var5.a6(), var5.t2()),
                     new com.aspose.slides.internal.o9b.w1(var5.h0(), var5.t2()),
                     new com.aspose.slides.internal.o9b.w1(var5.h0(), var5.l6())
                  };
                  var7 = new com.aspose.slides.internal.o9b.w1(var5.a6(), var5.l6());
                  break;
               case 5:
                  var8 = new com.aspose.slides.internal.o9b.w1[]{
                     new com.aspose.slides.internal.o9b.w1(var5.a6(), var5.l6()),
                     new com.aspose.slides.internal.o9b.w1(var5.a6(), var5.t2()),
                     new com.aspose.slides.internal.o9b.w1(var5.h0(), var5.t2())
                  };
                  var7 = new com.aspose.slides.internal.o9b.w1(var5.h0(), var5.l6());
                  break;
               case 6:
               default:
                  if (var1.m3() != null) {
                     var8 = var1.m3().a6();
                  } else {
                     var8 = new com.aspose.slides.internal.o9b.w1[]{
                        new com.aspose.slides.internal.o9b.w1(var5.a6(), var5.t2()),
                        new com.aspose.slides.internal.o9b.w1(var5.h0(), var5.t2()),
                        new com.aspose.slides.internal.o9b.w1(var5.h0(), var5.l6()),
                        new com.aspose.slides.internal.o9b.w1(var5.a6(), var5.l6()),
                        new com.aspose.slides.internal.o9b.w1(var5.a6(), var5.t2())
                     };
                  }

                  var7 = new com.aspose.slides.internal.o9b.w1((var5.a6() + var5.h0()) / 2.0F, (var5.t2() + var5.l6()) / 2.0F);
            }

            var2[0] = this.z3.k5(var4);
            String var9 = k5(var2[0]);

            for (int var10 = 1; var10 < var8.length; var10++) {
               com.aspose.slides.internal.o9b.w1 var11 = var8[var10].u3();
               com.aspose.slides.internal.o9b.w1 var12 = var8[var10 - 1].u3();
               if (!(com.aspose.slides.ms.System.q1.n5(var11.l6() - var12.l6()) + com.aspose.slides.ms.System.q1.n5(var11.k5() - var12.k5()) < 1.0F)
                  && !(com.aspose.slides.ms.System.q1.n5(var11.l6() - var7.l6()) + com.aspose.slides.ms.System.q1.n5(var11.k5() - var7.k5()) < 1.0F)
                  && !(com.aspose.slides.ms.System.q1.n5(var12.l6() - var7.l6()) + com.aspose.slides.ms.System.q1.n5(var12.k5() - var7.k5()) < 1.0F)) {
                  String var13 = this.z3.n5(var1, var11.u3(), var12.u3(), var7.u3(), var5.y4());
                  String var14 = com.aspose.slides.ms.System.d1.n5(
                     "M{0},{1} L{2},{3} L{4},{5} z",new Object[]{ n5(var7.l6()), n5(var7.k5()), n5(var12.l6()), n5(var12.k5()), n5(var11.l6()), n5(var11.k5())
                  });
                  com.aspose.slides.internal.z9u.l6 var15 = new com.aspose.slides.internal.z9u.l6();
                  var15.s7(var14);
                  var15.u3(k5(var13));
                  var15.k5(k5(var13));
                  var15.n5(com.aspose.slides.internal.b3z.a6.k5(0.5F));
                  var15.c8(var9);
                  this.k5(var15);
               }
            }

            this.a0.addItem(var3, var2[0]);
         } else {
            this.n5(var1, var3, var5.y4());
            var2[0] = null;
         }
      }
   }

   private void n5(u4z var1, String var2, com.aspose.slides.internal.o9b.y1 var3) {
      String var4 = this.z3.n5(var2);
      if (!com.aspose.slides.ms.System.d1.n5(var4)) {
         this.n5(var4, var3.y4());
      } else {
         com.aspose.slides.internal.o9b.u3 var5 = d4.n5(var1);
         com.aspose.slides.internal.o9b.l6 var6 = new com.aspose.slides.internal.o9b.l6(
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)var3.s7()), 14),
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)var3.k5()), 14)
         );

         try {
            var6.n5(96.0F, 96.0F);
            com.aspose.slides.internal.o9b.z1 var7 = com.aspose.slides.internal.o9b.z1.n5(var6);

            try {
               var7.l6(-var3.a6(), -var3.t2());
               var7.l6(var5, var3.y4());
            } finally {
               if (var7 != null) {
                  var7.dispose();
               }
            }

            boolean var8 = false;
            IGenericEnumerator var9 = var1.t4().getValues().iterator();

            try {
               while (var9.hasNext()) {
                  com.aspose.slides.internal.o9b.c8 var10 = (com.aspose.slides.internal.o9b.c8)var9.next();
                  if ((var10.s7() & 255) < 255) {
                     var8 = true;
                     break;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                  var9.dispose();
               }
            }

            String var11 = "image/png";
            com.aspose.slides.internal.z0k.e2 var12 = new com.aspose.slides.internal.z0k.e2();

            byte[] var36;
            try {
               if (var8) {
                  var6.n5(var12, com.aspose.slides.internal.j9e.x8.s7());
               } else {
                  com.aspose.slides.internal.j9e.h0 var13 = new com.aspose.slides.internal.j9e.h0();
                  var13.n5()[0] = new com.aspose.slides.internal.j9e.u9(com.aspose.slides.internal.j9e.a6.a6, this.z1().getJpegQuality());
                  var6.n5(var12, a4w.n5, var13);
                  var11 = "image/jpeg";
               }

               var36 = var12.toArray();
            } finally {
               if (var12 != null) {
                  var12.dispose();
               }
            }

            if (var36 != null) {
               this.n5(
                  var2,
                  var11,
                  var36,
                  var3.c8().a6(),
                  var3.y4(),
                  new com.aspose.slides.internal.o9b.y1(com.aspose.slides.internal.o9b.w1.n5.u3(), var3.c8().a6())
               );
            }
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.t4 var1, int var2, int var3) {
      this.n5(var1, (float)var2, (float)var3, (float)var1.e2(), (float)var1.h0());
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.t4 var1, float var2, float var3) {
      this.n5(var1, var2, var3, var1.e2(), var1.h0());
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.t4 var1, int var2, int var3, int var4, int var5) {
      this.n5(var1, (float)var2, (float)var3, (float)var4, (float)var5);
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.t4 var1, float var2, float var3, float var4, float var5) {
      com.aspose.slides.internal.z0k.e2 var6 = new com.aspose.slides.internal.z0k.e2();

      try {
         var1.n5(var6, com.aspose.slides.internal.j9e.x8.s7());
         this.s3();
         if (var1.e2() <= 0 || var1.h0() <= 0 || var4 <= 0.0F || var5 <= 0.0F) {
            return;
         }

         com.aspose.slides.internal.o9b.f2 var7 = new com.aspose.slides.internal.o9b.f2(var1.e2(), var1.h0());
         com.aspose.slides.internal.o9b.y1 var8 = new com.aspose.slides.internal.o9b.y1(var2, var3, var4, var5);
         com.aspose.slides.internal.o9b.y1 var9 = new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var1.e2(), var1.h0());
         byte[] var10 = var6.toArray();
         this.n5(com.aspose.slides.ms.System.o0.l6().toString(), "image/png", var10, var7.a6(), var8.y4(), var9.y4());
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }
   }

   @Override
   public void n5(IPPImage var1, com.aspose.slides.internal.o9b.y1 var2, com.aspose.slides.internal.o9b.y1 var3, a6l var4) {
      this.n5((PPImage)var1, var2.y4(), var3.y4());
   }

   private void n5(PPImage var1, com.aspose.slides.internal.o9b.y1 var2, com.aspose.slides.internal.o9b.y1 var3) {
      if ("image/x-emf".equals(var1.getContentType())) {
         int var4 = 2;
         int[] var5 = new int[]{2};
         com.aspose.slides.internal.o9b.y1 var6 = com.aspose.slides.internal.o9b.y1.n5(var1.k5());
         var4 = var5[0];
         this.n5(var1.n3().toString(), var1.getContentType(), var6.y4(), var1.getBinaryData(), var2.y4(), var3.y4());
      } else {
         byte[] var8 = this.n5(var1.getBinaryData(), var1.l6());
         this.n5(var1.n3().toString(), var1.getContentType(), com.aspose.slides.internal.o9b.p8.n5(var1.k5().h0()).a6(), var8, var2.y4(), var3.y4());
      }
   }

   private void n5(
      String var1,
      String var2,
      com.aspose.slides.internal.o9b.y1 var3,
      byte[] var4,
      com.aspose.slides.internal.o9b.y1 var5,
      com.aspose.slides.internal.o9b.y1 var6
   ) {
      com.aspose.slides.internal.o9b.f2 var7 = var3.c8().a6();
      com.aspose.slides.internal.o9b.y1 var8 = var6.y4();
      var6.n5(var3.y4());
      var5 = new com.aspose.slides.internal.o9b.y1(
         var5.x8() + (var6.x8() - var8.x8()) / var8.s7() * var5.s7(),
         var5.n3() + (var6.n3() - var8.n3()) / var8.k5() * var5.k5(),
         var6.s7() / var8.s7() * var5.s7(),
         var6.k5() / var8.k5() * var5.k5()
      );
      var6.k5(var6.x8() - var3.x8());
      var6.u3(var6.n3() - var3.n3());
      this.n5(var1, var2, var7.a6(), var4, var5.y4(), var6.y4());
   }

   private void n5(
      String var1,
      String var2,
      com.aspose.slides.internal.o9b.f2 var3,
      byte[] var4,
      com.aspose.slides.internal.o9b.y1 var5,
      com.aspose.slides.internal.o9b.y1 var6
   ) {
      this.s3();
      if (!(var6.s7() <= 0.0F) && !(var6.k5() <= 0.0F) && !(var5.s7() <= 0.0F) && !(var5.k5() <= 0.0F)) {
         this.n5(var1, var2, var4, var3.a6(), var5.y4(), var6.y4());
      }
   }

   private void n5(
      String var1,
      String var2,
      byte[] var3,
      com.aspose.slides.internal.o9b.f2 var4,
      com.aspose.slides.internal.o9b.y1 var5,
      com.aspose.slides.internal.o9b.y1 var6
   ) {
      String var7 = this.z3.n5(var1, var2, var3, this, var4.a6(), var6.y4());
      this.n5(var7, var5.y4());
   }

   private void n5(String var1, com.aspose.slides.internal.o9b.y1 var2) {
      com.aspose.slides.internal.d8v.h0 var3 = new com.aspose.slides.internal.d8v.h0();
      var3.l6(com.aspose.slides.internal.b3z.a6.k5(n5(var2.x8())));
      var3.k5(com.aspose.slides.internal.b3z.a6.k5(n5(var2.n3())));
      var3.u3(com.aspose.slides.internal.b3z.a6.k5(n5(var2.s7())));
      var3.a6(com.aspose.slides.internal.b3z.a6.k5(n5(var2.k5())));
      var3.n5(new com.aspose.slides.internal.b3z.k5(0));
      var3.n3(com.aspose.slides.ms.System.d1.n5("#{0}", new Object[]{var1}));
      this.k5(var3);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.o9b.y1 var2, TextParam var3) {
      if (var1 != null) {
         if (var3.e2() != 1) {
            this.n5(var1, var2.y4(), var3, var3.d2());
         } else {
            this.l6(var1, var2.y4(), var3);
         }
      }
   }

   @Override
   void n5(String var1, com.aspose.slides.internal.o9b.y1 var2, TextParam var3, e4z var4) {
      var1 = var4.n5(var1);
      if (!this.l6(var3)) {
         if (this.k5(var3)) {
            this.w1();
            this.z8 = true;
         }

         if (!this.m3) {
            this.n5(var3);
         }

         this.k5(var1, var2.y4(), var3);
      } else {
         if (this.b3 != null) {
            this.n5(this.b3);
            this.b3 = null;
         }

         this.n5(var1, var2.u9().u3(), var3);
      }

      if (!this.z3.k5.containsItem(var3.z3())) {
         this.z3.k5.addItem(var3.z3());
      }
   }

   private void n5(TextParam var1) {
      this.s3();
      this.m3 = true;
      this.e5 = var1;
      com.aspose.slides.internal.o9b.w1.n5.n5(this.o0);
   }

   private void k5(String var1, com.aspose.slides.internal.o9b.y1 var2, TextParam var3) {
      Paragraph var4 = null;
      if (var3.u3 != null) {
         var4 = var3.u3.n3();
      }

      String var5 = com.aspose.slides.ms.System.d1.n5;
      boolean var6 = false;
      if (var4 != null) {
         IPortionCollection var7 = var4.getPortions();
         var5 = var7.get_Item(0).getPortionFormat().getEffective().getLanguageId();
         if (var3.k5() == 0.0F) {
            int var8 = var7.indexOf(var3.u3) + 1;
            if (var8 > 0 && var8 < var7.getCount()) {
               var6 = var7.get_Item(var8).getPortionFormat().getEffective().getEscapement() != 0.0F;
            }
         }
      }

      s5v var11 = new s5v(var1, var2.y4(), var3, var5, var6);
      boolean var12 = com.aspose.slides.ms.System.o5.n5(var3.j5(), new com.aspose.slides.ms.System.o5<>(true));
      boolean var9 = this.b3 == null;
      boolean var10 = this.b3 != null && this.b3.n5(var11);
      if (var10 && var2.a6() - this.b3.n5().h0() > 0.05) {
         var10 = false;
      }

      if (var10 && var4 != null && var4.n5().t9().getRightToLeft()) {
         var10 = false;
      }

      if (com.aspose.slides.ms.System.o5.n5(var3.w1(), new com.aspose.slides.ms.System.o5<>(true)) || com.aspose.slides.ms.System.o5.n5(this.i1, null)) {
         this.i1 = new com.aspose.slides.ms.System.o5<>(new com.aspose.slides.internal.o9b.w1(var11.k5().l6(), var11.k5().k5()));
      }

      if (this.z8) {
         this.n5(var11);
         this.w1();
      } else if (var12) {
         if (var9) {
            this.n5(var11);
         } else {
            if (var10) {
               this.b3.n5(var1, var2.s7());
               this.n5(this.b3);
            } else {
               this.n5(this.b3);
               this.n5(var11);
            }

            this.b3 = null;
         }

         if (!this.l6(var11)
            || var1.length() == 1
               && var1.charAt(0) < '\uf000'
               && (
                  var3.y2().equalsIgnoreCase("Wingdings")
                     || var3.y2().equalsIgnoreCase("Wingdings 2")
                     || var3.y2().equalsIgnoreCase("Wingdings 3")
                     || var3.y2().equalsIgnoreCase("Webdings")
               )) {
            this.w1();
         }
      } else {
         if (var9) {
            this.b3 = var11;
         } else if (var10) {
            this.b3.n5(var1, var2.s7());
         } else {
            this.n5(this.b3);
            this.b3 = var11;
         }

         if (this.r4 != null) {
            this.n5(this.b3);
            this.b3 = null;
         }
      }
   }

   private void n5(s5v var1) {
      String var2 = var1.z3();
      boolean var3 = false;
      if (!this.u6) {
         for (int var4 = 0; var4 < var2.length(); var4++) {
            if (var2.charAt(var4) < ' ' || var2.charAt(var4) == ' ' && var4 > 0 && var2.charAt(var4 - 1) == ' ') {
               var3 = true;
               break;
            }
         }
      }

      int var10 = 0;

      while (var10 < var2.length()) {
         int var5 = var10;
         if (this.u6) {
            var5 = var2.length();
         } else {
            char var6 = 'a';

            while (var5 < var2.length() && var2.charAt(var5) >= ' ' && (var6 > ' ' || var2.charAt(var5) > ' ')) {
               var6 = var2.charAt(var5++);
            }
         }

         while (var10 < var5 && var2.charAt(var5 - 1) == ' ') {
            var5--;
         }

         if (var10 < var5) {
            String var11 = com.aspose.slides.ms.System.d1.l6(var2, var10, var5 - var10);
            float var7 = this.n5(var11, var1);
            com.aspose.slides.internal.o9b.c8 var8 = (this.b3() ? var1.u3() : var1.a6()).o8();
            com.aspose.slides.internal.j7h.l6 var9 = new com.aspose.slides.internal.j7h.l6();
            if (this.l6(var1)) {
               this.n5(var9, var1.k5().l6(), var1.k5().k5(), var7, var1, var8.o8(), this.e5.c8().o8());
            } else {
               this.n5(var9, var1, var8.o8(), this.e5.c8().o8());
            }

            this.o0 = new com.aspose.slides.internal.o9b.w1(var1.k5().l6() + com.aspose.slides.ms.System.q1.n5(var7), var1.k5().k5());
            var9.n5(new com.aspose.slides.internal.j7h.n5(var11));
            if (var3 || com.aspose.slides.ms.System.d1.l6(var11, " ")) {
               var9.n5(true);
            }

            if (this.u3(var1)) {
               this.n5(var11, var7, var8.o8(), var1, var9);
            }

            var1.n5(var7);
            this.l6(var9);
            var10 = var5;
         }

         while (var5 < var2.length() && var2.charAt(var5) <= ' ') {
            var5++;
         }

         if (var10 < var5) {
            String var12 = com.aspose.slides.ms.System.d1.l6(var2, var10, var5 - var10);
            float var13 = this.n5(var12, var1);
            com.aspose.slides.internal.j7h.l6 var14 = new com.aspose.slides.internal.j7h.l6();
            var14.n5(true);
            if (this.f2.size() > 0) {
               var14.h0(com.aspose.slides.ms.System.d1.n5(new String[]{this.f2.get_Item(0).getId(), "_space"}));
            }

            if (this.l6(var1)) {
               this.n5(var14, var1.k5().l6(), var1.k5().k5(), var13, var1, this.e5.c8().o8(), this.e5.c8().o8());
            } else {
               this.n5(var14, var1, var1.a6().o8(), this.e5.c8().o8());
            }

            this.o0 = new com.aspose.slides.internal.o9b.w1(var1.k5().l6() + com.aspose.slides.ms.System.q1.n5(var13), var1.k5().k5());
            var14.n5(new com.aspose.slides.internal.j7h.n5(var12));
            this.l6(var14);
            var10 = var5;
            var1.n5(var13);
         }
      }

      if (this.f2.size() > 0) {
         this.f2.removeAt(0);
      }
   }

   private void n5(String var1, float var2, com.aspose.slides.internal.o9b.c8 var3, s5v var4, com.aspose.slides.internal.j7h.l6 var5) {
      if (this.u3(var4)) {
         com.aspose.slides.internal.x4g.s7 var6 = n2d.n5(var1, this, var4.l6(), var4.k5().u3(), this.a6, var2);
         TextParam var7 = var4.l6();
         if (var4.n3() && !var4.l6().u6()) {
            if (var7.t2 != null) {
               c8k var8 = new c8k(var7.t2);
               var8.n5(this, var6, var7);
            }

            if (var7.n3 != null && var7.u6()) {
               i5q var18 = new i5q(var7.n3);
               var18.n5(this, var6, var7.u3(), null);
            }
         }

         if (var4.x8()) {
            q1k var19 = new q1k(var7.c8);
            boolean var9 = this.k7;
            this.k7 = false;
            var19.n5(this, var6, var7, var4.k5().u3());
            this.k7 = var9;
         }

         if (com.aspose.slides.ms.System.d1.n5(var5.k7())) {
            var5.h0(this.o0());
         }

         com.aspose.slides.internal.o9b.w1 var20 = this.r4().u3();
         float var21 = 0.0F;
         float var10 = 0.0F;
         if (var4.e2()) {
            if (var20.l6() > 0.0F) {
               var21 = (float)(var4.l6().a6().n5() / 2.0);
            } else if (var20.l6() < 0.0F) {
               var21 = -((float)(var4.l6().a6().n5() / 2.0));
            }

            if (var20.k5() > 0.0F) {
               var10 = (float)(var4.l6().a6().n5() / 2.0);
            } else if (var20.k5() < 0.0F) {
               var10 = -((float)(var4.l6().a6().n5() / 2.0));
            }
         }

         if (!var4.t2() && !var4.s7()) {
            float var22 = var4.k5().l6() - var20.l6() * var4.t9() / 60.0F + var21;
            float var12 = var4.k5().k5() - var20.k5() * var4.t9() / 60.0F + var10;
            com.aspose.slides.internal.o9b.c8 var13 = var4.u9().o8();
            com.aspose.slides.internal.o9b.c8 var14 = com.aspose.slides.internal.o9b.c8.n5(
                  (var13.s7() & 255) / 2,
                  com.aspose.slides.internal.v6g.k5.u3((var13.x8() & 0xFF) * 0.6 + 0.5, 14),
                  com.aspose.slides.internal.v6g.k5.u3((var13.n3() & 0xFF) * 0.6 + 0.5, 14),
                  com.aspose.slides.internal.v6g.k5.u3((var13.y4() & 0xFF) * 0.6 + 0.5, 14)
               )
               .o8();
            com.aspose.slides.internal.o9b.c8 var15 = com.aspose.slides.internal.o9b.c8.n5(
                  (var13.s7() & 255) / 2,
                  255 - com.aspose.slides.internal.v6g.k5.u3((255 - (var13.x8() & 255)) * 0.6 + 0.5, 14),
                  255 - com.aspose.slides.internal.v6g.k5.u3((255 - (var13.n3() & 255)) * 0.6 + 0.5, 14),
                  255 - com.aspose.slides.internal.v6g.k5.u3((255 - (var13.y4() & 255)) * 0.6 + 0.5, 14)
               )
               .o8();
            com.aspose.slides.internal.j7h.l6 var16 = this.n5(var5, "embosseLight", var22, var12, var15.o8());
            this.l6(var16);
            com.aspose.slides.internal.j7h.l6 var17 = this.n5(var5, "embosseDark", var22, var12, var14.o8());
            this.l6(var17);
         } else {
            com.aspose.slides.internal.o9b.w1 var11 = new com.aspose.slides.internal.o9b.w1(var21, var10);
            if (var4.t2() && !var4.l6().u6()) {
               this.n5(com.aspose.slides.internal.v6g.k5.n5(var7.x8, k0p.class), var4, var6, var5, var11.u3(), var3.o8(), true);
               this.n5(com.aspose.slides.internal.v6g.k5.n5(var7.s7, k0p.class), var4, var6, var5, var11.u3(), var3.o8(), false);
            }

            if (var4.s7()) {
               this.n5(var4, var20.u3(), var5, var11.u3());
            }
         }

         if (var4.e2()) {
            var5.k5(new com.aspose.slides.internal.b3z.u3(var4.l6().a6().h0().o8()).toString());
            var5.n5(com.aspose.slides.internal.b3z.a6.k5((float)var4.l6().a6().n5()));
            if ((var4.l6().a6().h0().s7() & 255) < 255) {
               var5.n5(l6(var4.l6().a6().h0().o8()));
            }
         }
      }
   }

   private void n5(
      k0p var1,
      s5v var2,
      com.aspose.slides.internal.x4g.s7 var3,
      com.aspose.slides.internal.j7h.l6 var4,
      com.aspose.slides.internal.o9b.w1 var5,
      com.aspose.slides.internal.o9b.c8 var6,
      boolean var7
   ) {
      TextParam var8 = var2.l6();
      if (var8 != null && var1 != null) {
         z2r var9 = new z2r(var1, var7);
         if (!var1.u9() && !(var1.getBlurRadius() > 3.0) && var1.getScaleHorizontal() == 100.0 && var1.getScaleVertical() == 100.0
            || var1.getDistance() == 0.0 && var1.getDirection() == 0.0F) {
            com.aspose.slides.internal.x4g.m1 var10 = var9.n5(var8, new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var8.n5.n5, var8.n5.l6), var8.z1(), false);
            com.aspose.slides.internal.o9b.w1[] var11 = new com.aspose.slides.internal.o9b.w1[]{var2.k5()};
            var10.n5(var11);
            float var12 = var11[0].l6() + var5.l6();
            float var13 = var11[0].k5() + var5.k5();
            com.aspose.slides.internal.o9b.c8 var14 = n2d.n5(var1.l6().o8(), var6.s7()).o8();
            if (var1.getBlurRadius() >= 3.0) {
               n5(var14.o8(), 80).n5(var14);
            }

            com.aspose.slides.internal.j7h.l6 var15 = this.n5(var4, "shadow", var12, var13, var14.o8());
            if (var8.t2() && var8.d2().u9()) {
               var15.k5(new com.aspose.slides.internal.b3z.u3(var14.o8()).toString());
               if ((var14.s7() & 255) < 255) {
                  var15.n5(l6(var14.o8()));
               }
            }

            this.l6(var15);
         } else {
            var9.n5(this, var3, var8);
         }
      }
   }

   private void n5(s5v var1, com.aspose.slides.internal.o9b.w1 var2, com.aspose.slides.internal.j7h.l6 var3, com.aspose.slides.internal.o9b.w1 var4) {
      float var5 = var1.k5().l6() - var2.l6() * var1.t9() / 60.0F + var4.l6();
      float var6 = var1.k5().k5() - var2.k5() * var1.t9() / 60.0F + var4.k5();
      com.aspose.slides.internal.o9b.c8 var7 = this.e5.h0().o8();
      com.aspose.slides.internal.j7h.l6 var8 = this.n5(var3, "shadow", var5, var6, var7.o8());
      this.l6(var8);
   }

   private boolean i1() {
      return this.l6((s5v)null);
   }

   private boolean l6(s5v var1) {
      if (var1 != null) {
         if (com.aspose.slides.ms.System.o5.n5(this.e5.w1(), new com.aspose.slides.ms.System.o5<>(true))
            || com.aspose.slides.ms.System.o5.n5(this.e5.j5(), new com.aspose.slides.ms.System.o5<>(true))) {
            return true;
         }

         if (this.k5(var1)) {
            return true;
         }

         if (!this.o0.n5() && var1.n5().n3() == this.o0.k5() && var1.k5().l6() - this.o0.l6() > 0.4) {
            return true;
         }

         if (this.u3(var1)) {
            return true;
         }

         if (this.h2.size() > 0 && com.aspose.slides.internal.v6g.k5.l6(this.h2.get_Item(this.h2.size() - 1).getKey(), SmartArtShape.class)) {
            return true;
         }
      }

      return false;
   }

   private boolean k5(s5v var1) {
      if (var1 != null) {
         if (this.e5.z8() != null || var1.q0()) {
            return true;
         }

         if (com.aspose.slides.ms.System.q1.n5(var1.l6().q0()) > 0.005 && !var1.l6().k5(var1.l6().y2())) {
            return true;
         }

         c9g var2 = var1.l6().a6;
         if ("zh-CN".equals(var1.t4()) || var2 != null && "zh-CN".equals(var2.getLanguageId())) {
            return true;
         }
      }

      return false;
   }

   private boolean u3(s5v var1) {
      return !this.b3() && (var1.t2() || var1.s7() || var1.x8() || var1.n3() || var1.e2());
   }

   private com.aspose.slides.internal.j7h.l6 n5(
      com.aspose.slides.internal.j7h.l6 var1, String var2, float var3, float var4, com.aspose.slides.internal.o9b.c8 var5
   ) {
      com.aspose.slides.internal.j7h.l6 var6 = (com.aspose.slides.internal.j7h.l6)var1.y1();
      var6.h0(com.aspose.slides.ms.System.d1.n5(new String[]{var1.k7(), "_", var2}));
      var6.l6(new com.aspose.slides.internal.b3z.u9(com.aspose.slides.internal.b3z.a6.k5(var3)));
      var6.k5(new com.aspose.slides.internal.b3z.u9(com.aspose.slides.internal.b3z.a6.k5(var4)));
      this.n5(var6, var5.o8());
      return var6;
   }

   private float n5(String var1, s5v var2) {
      if (var2.l6().z8() != null) {
         return var2.n5().s7();
      }

      TextParam var3 = var2.l6();
      if (com.aspose.slides.ms.System.q1.n5(var3.q0()) > 0.005) {
         var3 = var2.l6().r4();
         var3.n5(var3.q0() * 0.75F);
      }

      com.aspose.slides.internal.o9b.f2 var4 = this.n5(var1, var3).a6();
      return var4.l6();
   }

   private void n5(String var1, com.aspose.slides.internal.o9b.w1 var2, TextParam var3) {
      this.s3();
      e4z var4 = var3.d2();
      float var5 = n5(var4, this.l6);
      com.aspose.slides.internal.o9b.w1 var6 = new com.aspose.slides.internal.o9b.w1(
         var2.l6(), var2.k5() - var3.p8() * var3.k5() / 100.0F + (var3.k5() != 0 ? var5 * 0.3F : 0.0F) - var5
      );
      float var7 = var3.f2() * 96.0F / 72.0F;
      com.aspose.slides.internal.x4g.s7 var8 = new com.aspose.slides.internal.x4g.s7();
      var8.n5(var1, var4.n5().l6(), var4.n5().x8(), var7, var6.u3(), this.a6);
      String var9 = null;
      if (!this.b3() && var3.x8()) {
         var9 = com.aspose.slides.ms.System.d1.n5("tp_", com.aspose.slides.ms.System.a3.n5(this.y2++, "x"));
         com.aspose.slides.internal.o9b.w1 var10 = this.r4().u3();
         var10.n5(var10.l6() * var3.p8());
         var10.l6(var10.k5() * var3.p8());
         if (var3.x8()) {
            com.aspose.slides.internal.d8v.h0 var11 = new com.aspose.slides.internal.d8v.h0();
            var11.n3(com.aspose.slides.ms.System.d1.n5("#{0}", new Object[]{var9}));
            this.n5(var11, var3.h0().o8());
            var11.t2(
               com.aspose.slides.ms.System.d1.n5(
                  "translate({0}, {1})",new Object[]{ com.aspose.slides.ms.System.Xml.f4.n5(var10.l6() / 15.0F), com.aspose.slides.ms.System.Xml.f4.n5(var10.k5() / 15.0F)
               })
            );
            this.k5(var11);
         }
      }

      com.aspose.slides.internal.o9b.c8 var14 = (this.b3() ? var3.u9() : var3.c8()).o8();
      com.aspose.slides.internal.l7h.a5 var15 = new com.aspose.slides.internal.l7h.a5();
      com.aspose.slides.internal.n8e.i6.n5(var8, var15, null);
      if (var9 != null) {
         com.aspose.slides.internal.z9u.l6 var12 = new com.aspose.slides.internal.z9u.l6();
         var12.h0(var9);
         var12.s7(var15.toString());
         com.aspose.slides.internal.d8v.l6 var13 = new com.aspose.slides.internal.d8v.l6();
         this.n5(var13, var14.o8());
         var13.n5(var12);
         this.k5(var13);
      } else {
         com.aspose.slides.internal.z9u.l6 var16 = new com.aspose.slides.internal.z9u.l6();
         var16.s7(var15.toString());
         this.n5(var16, var14.o8());
         this.k5(var16);
      }
   }

   public final boolean l6(String var1) {
      int var2 = com.aspose.slides.ms.System.u3.l6(this.z3.k5(), new q4b$1(this, var1));
      return var2 != -1;
   }

   private void n5(List<com.aspose.slides.internal.d0e.a6> var1) {
      if (var1.size() != 0) {
         com.aspose.slides.internal.j7h.k5 var2 = new com.aspose.slides.internal.j7h.k5();
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         boolean var6 = this.l6(this.e5.z3());
         String var7;
         if (var6) {
            var7 = com.aspose.slides.internal.n8e.v4.a6(this.e5.z3());
            var3 = this.e5.s7() ? 1 : 0;
            var4 = this.e5.t2() ? 700 : 400;
            var5 = 4;
         } else {
            e4z var8 = this.e5.d2();
            String var9 = var8.l6().n5().l6();
            int[] var10 = new int[]{0};
            int[] var11 = new int[]{0};
            int[] var12 = new int[]{0};
            var7 = n5(this.e5.z3(), var10, var11, var12);
            var3 = var10[0];
            var4 = var11[0];
            var5 = var12[0];
            if (!com.aspose.slides.ms.System.d1.a6(var7, var9)) {
               if (var4 >= 400 || this.e5.t2() && (!var8.u9() || com.aspose.slides.ms.System.d1.c8(var9, "Book") >= 0)) {
                  var7 = com.aspose.slides.ms.System.d1.n5(var7, com.aspose.slides.ms.System.d1.n5(new String[]{", ", var9}));
               } else {
                  var7 = com.aspose.slides.ms.System.d1.n5(new String[]{var9, ", ", var7});
               }
            }

            String var13 = this.e5.y2();
            if (!com.aspose.slides.ms.System.d1.n5(var13) && !com.aspose.slides.ms.System.d1.a6(var13, this.e5.z3()) && this.q0.n5().n5(var13) == 2) {
               var7 = com.aspose.slides.ms.System.d1.n5(new String[]{var13, ", ", var7});
            }

            if (com.aspose.slides.ms.System.d1.n5(var7)) {
               throw new InvalidOperationException("Failed to sanitize font name");
            }

            if (this.e5.s7()) {
               var3 = 1;
            }
         }

         var2.s7(var7);
         var2.c8(var3);
         var2.h0(var4);
         var2.t2(var5);
         if (this.e5.a5()) {
            var2.l6.l6("Style", "font-variant-ligatures : none");
         }

         if (this.e5.y4()) {
            var2.s7(1);
         }

         var2.k5(new com.aspose.slides.internal.b3z.a6(this.e5.f2(), 9));
         this.n5(var2, this.e5.c8().o8());
         if (!this.i1()) {
            var2.l6(new com.aspose.slides.internal.b3z.u9(com.aspose.slides.internal.b3z.a6.k5(this.i1.n5().l6())));
            var2.k5(new com.aspose.slides.internal.b3z.u9(com.aspose.slides.internal.b3z.a6.k5(this.i1.n5().k5())));
         }

         List$Enumerator var20 = var1.iterator();

         try {
            while (var20.hasNext()) {
               com.aspose.slides.internal.d0e.a6 var21 = (com.aspose.slides.internal.d0e.a6)var20.next();
               var2.n5(var21);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
               var20.dispose();
            }
         }

         com.aspose.slides.internal.j7h.n5 var22 = new com.aspose.slides.internal.j7h.n5(com.aspose.slides.internal.n1n.u3.n5(var2, 0), true);
         this.k5(var22);
      }
   }

   private static String n5(String var0, int[] var1, int[] var2, int[] var3) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         throw new ArgumentException("value");
      }

      var1[0] = 0;
      var2[0] = 400;
      var3[0] = 4;
      com.aspose.slides.internal.l7h.a5 var4 = new com.aspose.slides.internal.l7h.a5(var0.length());
      String[] var5 = com.aspose.slides.ms.System.d1.n5(var0, ' ');

      for (int var6 = 0; var6 < var5.length; var6++) {
         String var7 = var5[var6];
         String var8 = com.aspose.slides.ms.System.d1.u9(var7);
         if (f0.containsKey(var8)) {
            var1[0] = f0.get_Item(var8);
         } else if (var6 > 0 && a3.containsKey(var8)) {
            var2[0] = a3.get_Item(var8);
         } else if (p3.containsKey(var8)) {
            var3[0] = p3.get_Item(var8);
         } else {
            var4.n5(var7).n5(' ');
         }
      }

      String var9 = var4.toString();
      return com.aspose.slides.ms.System.d1.a6(var9, new char[]{});
   }

   private boolean l6(TextParam var1) {
      String var2 = var1.z3();
      if (FontsLoader.n5(var2) && this.q0.getExternalFontsHandling() == 2) {
         int var3 = this.q0.n5().n5(var2);
         if (var3 != 1) {
            return true;
         }
      }

      int var4;
      if (com.aspose.slides.ms.System.d1.a6(this.v4, var2)) {
         var4 = this.z7;
      } else {
         var4 = this.q0.n5().n5(var2);
         this.v4 = var2;
         this.z7 = var4;
      }

      return var4 == 2 || var4 == 0 && this.q0.getVectorizeText();
   }

   private boolean k5(TextParam var1) {
      int var2 = 0;
      int var3 = 0;
      int var4 = 0;
      int[] var5 = new int[]{0};
      int[] var6 = new int[]{0};
      int[] var7 = new int[]{0};
      n5(var1.z3(), var5, var6, var7);
      var2 = var5[0];
      var3 = var6[0];
      var4 = var7[0];
      return var3 != 400 || var2 != 0 || var4 != 4;
   }

   @Override
   public void j5() {
      if (this.b3 != null) {
         this.n5(this.b3);
         this.b3 = null;
      }

      this.f2.clear();
   }

   @Override
   public void w1() {
      if (this.m3) {
         if (this.b3 != null) {
            this.n5(this.b3);
            this.b3 = null;
         }

         this.m3 = false;
         this.z8 = false;
         this.n5(this.p8);
         this.d5.clear();
         this.p8.clear();
         this.f2.clear();
         this.e5 = null;
         this.i1 = new com.aspose.slides.ms.System.o5<>();
      }
   }

   @Override
   public void n5(IHyperlink var1) {
      if (this.b3 != null) {
         this.n5(this.b3);
         this.b3 = null;
      }

      super.n5(var1);
      com.aspose.slides.internal.d8v.u3 var2 = null;
      if (!k5(var1) || this.q0.getSkipJavaScriptLinks() && ((Hyperlink)var1).k5(false)) {
         if (var1.getTargetSlide() != null) {
            var2 = new com.aspose.slides.internal.d8v.u3();
            var2.s7(com.aspose.slides.ms.System.d1.n5("#Slide{0}", new Object[]{((Slide)var1.getTargetSlide()).z8() + 1}));
         }
      } else {
         var2 = new com.aspose.slides.internal.d8v.u3();
         var2.s7(var1.getExternalUrl());
      }

      if (var2 != null) {
         this.r4 = var1;
         this.l6(var2);
         this.d5.push(var2);
      }
   }

   @Override
   public void u3() {
      super.u3();
      if (this.r4 != null) {
         if (this.d5.size() != 0) {
            this.d5.pop();
         }

         this.r4 = null;
      }
   }

   @Override
   public void l6(IHyperlink var1) {
      if (this.t4().e2() == null || !Hyperlink.op_Equality((Hyperlink)this.t4().e2(), (Hyperlink)this.c4)) {
         super.l6(var1);
         com.aspose.slides.internal.d8v.u3 var2 = null;
         if (!k5(var1) || this.q0.getSkipJavaScriptLinks() && ((Hyperlink)var1).k5(false)) {
            if (var1.getTargetSlide() != null) {
               var2 = new com.aspose.slides.internal.d8v.u3();
               var2.s7(com.aspose.slides.ms.System.d1.n5("#Slide{0}", new Object[]{((Slide)var1.getTargetSlide()).z8() + 1}));
            }
         } else {
            var2 = new com.aspose.slides.internal.d8v.u3();
            var2.s7(var1.getExternalUrl());
         }

         if (var2 != null) {
            this.c4 = var1;
            this.u3(var2);
         }
      }
   }

   @Override
   public void a6() {
      if (this.t4().e2() == null || !Hyperlink.op_Equality((Hyperlink)this.t4().e2(), (Hyperlink)this.c4)) {
         super.a6();
         if (this.c4 != null) {
            this.c4 = null;
            this.s3.pop();
         }
      }
   }

   private void e5() {
      if (this.w1) {
         this.w1 = false;
         List$Enumerator var1 = this.h2.iterator();

         try {
            while (var1.hasNext()) {
               KeyValuePair var2 = (KeyValuePair)var1.next();
               SvgShape var3 = (SvgShape)var2.getValue();
               if (var3.l6()) {
                  com.aspose.slides.internal.d8v.l6 var4 = new com.aspose.slides.internal.d8v.l6();
                  this.u3(var4);
                  IGenericEnumerator var5 = var3.n5().iterator();

                  try {
                     while (var5.hasNext()) {
                        KeyValuePair var6 = (KeyValuePair)var5.next();
                        int var7 = (Integer)var6.getKey();
                        var4.l6.l6(v0.n5(var7), (String)var6.getValue());
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                        var5.dispose();
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }
      }
   }

   final void n5(Shape var1, SvgShape var2) {
      if (var2.l6() || com.aspose.slides.internal.v6g.k5.l6(var1, Table.class) || com.aspose.slides.internal.v6g.k5.l6(var1, SmartArt.class)) {
         this.f2();
         this.e5();
         com.aspose.slides.internal.d8v.l6 var3 = new com.aspose.slides.internal.d8v.l6();
         this.u3(var3);
         if (!com.aspose.slides.ms.System.d1.n5(var2.getId())) {
            var3.h0(var2.getId());
         }

         IGenericEnumerator var4 = var2.n5().iterator();

         try {
            while (var4.hasNext()) {
               KeyValuePair var5 = (KeyValuePair)var4.next();
               int var6 = (Integer)var5.getKey();
               var3.l6.l6(v0.n5(var6), (String)var5.getValue());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1, Table.class)) {
            var3.u3(2);
         }
      }

      this.h2.addItem(new KeyValuePair<>(var1, var2));
   }

   final void l6(Shape var1) {
      int var2 = this.h2.size() - 1;

      while (var2 >= 0 && this.h2.get_Item(var2).getKey() != var1) {
         var2--;
      }

      if (var2 >= 0) {
         for (; this.h2.size() > var2; this.h2.removeAt(var2)) {
            if (!this.w1
               && (
                  this.h2.get_Item(var2).getValue().l6()
                     || com.aspose.slides.internal.v6g.k5.l6(this.h2.get_Item(var2).getKey(), Table.class)
                     || com.aspose.slides.internal.v6g.k5.l6(var1, SmartArt.class)
               )) {
               this.f2();
               this.s3.pop();
            }
         }
      }
   }

   final void n5(SvgTSpan var1) {
      this.f2.addItem(var1);
   }

   @Override
   com.aspose.slides.internal.o9b.y1 t9() {
      return new com.aspose.slides.internal.o9b.y1();
   }

   @Override
   void n5(com.aspose.slides.internal.o9b.y1 var1) {
      String[] var2 = new String[]{this.t9};
      boolean var3 = !this.e2.tryGetValue(var1.y4(), var2);
      this.t9 = var2[0];
      if (var3) {
         this.t9 = com.aspose.slides.ms.System.d1.n5(new Object[]{"ClipRect_", com.aspose.slides.ms.System.o0.l6()});
         com.aspose.slides.internal.d8v.n5 var4 = new com.aspose.slides.internal.d8v.n5();
         com.aspose.slides.internal.u3t.n5 var5 = new com.aspose.slides.internal.u3t.n5();
         var5.h0(this.t9);
         com.aspose.slides.internal.i1k.u9 var6 = new com.aspose.slides.internal.i1k.u9();
         var6.l6(com.aspose.slides.internal.b3z.a6.k5(n5(var1.x8())));
         var6.k5(com.aspose.slides.internal.b3z.a6.k5(n5(var1.n3())));
         var6.u3(com.aspose.slides.internal.b3z.a6.k5(n5(var1.s7())));
         var6.a6(com.aspose.slides.internal.b3z.a6.k5(n5(var1.k5())));
         var5.n5(var6);
         var4.n5(var5);
         this.k5(var4);
         this.e2.addItem(var1.y4(), this.t9);
      }
   }

   final void n5(com.aspose.slides.internal.d0e.a6 var1) {
      if (!"NoClip".equals(this.t9)) {
         var1.c8(com.aspose.slides.ms.System.d1.n5("url(#{0})", new Object[]{this.t9}));
      }
   }

   private void n5(com.aspose.slides.internal.d0e.a6 var1, com.aspose.slides.internal.o9b.c8 var2) {
      var1.u3(new com.aspose.slides.internal.b3z.u3(var2.o8()).toString());
      if ((var2.s7() & 255) < 255) {
         var1.l6(l6(var2.o8()));
      }
   }

   private void n5(com.aspose.slides.internal.d0e.a6 var1, l6v var2, boolean var3, a1v var4, com.aspose.slides.internal.x4g.s7 var5) {
      if (var2 != null && var2.u9()) {
         float var6 = (float)var2.n5() * this.t4;
         if (com.aspose.slides.ms.System.q1.n5(var6) <= Float.MIN_VALUE) {
            var6 = 0.5F;
         }

         float[] var7 = null;
         float[][] var8 = new float[][]{(float[])var7};
         a5.tryGetValue(var2.k5(), var8);
         var7 = var8[0];
         if (0 == var2.u3()) {
            if (var7 != null && var7.length > 0) {
               com.aspose.slides.internal.b3z.u9 var13 = new com.aspose.slides.internal.b3z.u9();
               var13.addItem(com.aspose.slides.internal.b3z.a6.k5((var7[0] - 1.0F) * var6));
               int var16 = 1;

               for (int var11 = 1; var16 < var7.length; var11 = -var11) {
                  var13.addItem(com.aspose.slides.internal.b3z.a6.k5((var7[var16] + var11) * var6));
                  var16++;
               }

               var1.n5(var13);
            }

            var1.n5(1);
         } else if (var7 != null && var7.length > 0) {
            com.aspose.slides.internal.b3z.u9 var9 = new com.aspose.slides.internal.b3z.u9();

            for (int var10 = 0; var10 < var7.length; var10++) {
               var9.addItem(com.aspose.slides.internal.b3z.a6.k5(var7[var10] * var6));
            }

            var1.n5(var9);
         }

         float var14 = 0.0F;
         if (!var3 && var2.s7() != 0) {
            float[] var17 = new float[]{0.0F};
            String var19 = this.z3.n5(this, var2, true, var17);
            var14 = var17[0];
            var1.a6(k5(var19));
         }

         if (!var3 && var2.x8() != 0) {
            float[] var18 = new float[]{var14};
            String var20 = this.z3.n5(this, var2, false, var18);
            var14 = var18[0];
            var1.u9(k5(var20));
         }

         var1.n5(com.aspose.slides.internal.b3z.a6.k5(var6));
         this.n5(var1, var2.u9);
      }

      this.n5(var1, var4, var5);
   }

   private void n5(
      com.aspose.slides.internal.j7h.u3 var1,
      float var2,
      float var3,
      float var4,
      s5v var5,
      com.aspose.slides.internal.o9b.c8 var6,
      com.aspose.slides.internal.o9b.c8 var7
   ) {
      var1.l6(new com.aspose.slides.internal.b3z.u9(com.aspose.slides.internal.b3z.a6.k5(var2)));
      var1.k5(new com.aspose.slides.internal.b3z.u9(com.aspose.slides.internal.b3z.a6.k5(var3)));
      if (com.aspose.slides.ms.System.o5.l6(var5.l6().w1(), new com.aspose.slides.ms.System.o5<>(true)) || this.z8 || this.k5(var5)) {
         var1.l6(com.aspose.slides.internal.b3z.a6.k5(var4));
      }

      this.n5(var1, var5, var6.o8(), var7.o8());
   }

   private void n5(com.aspose.slides.internal.j7h.u3 var1, s5v var2, com.aspose.slides.internal.o9b.c8 var3, com.aspose.slides.internal.o9b.c8 var4) {
      if (this.e5.s7() != var2.z1()) {
         var1.c8(var2.z1() ? 1 : 0);
      }

      String var5 = this.e5.z3();
      String var6 = var2.h0();
      if (!com.aspose.slides.ms.System.d1.a6(var5, var6)) {
         int var7 = 0;
         int var8 = 0;
         int var9 = 0;
         var1.s7(this.l6(var6) ? com.aspose.slides.internal.n8e.v4.a6(var6) : var6);
         int[] var10 = new int[]{0};
         int[] var11 = new int[]{0};
         int[] var12 = new int[]{0};
         n5(var2.h0(), var10, var11, var12);
         var7 = var10[0];
         var8 = var11[0];
         var9 = var12[0];
         if (var8 > var1.f2()) {
            var1.h0(var8);
         }

         if (var7 > var1.i1()) {
            var1.c8(var7);
         }

         var1.t2(var9);
      }

      if (this.e5.y4() != var2.y4()) {
         var1.s7(var2.y4() ? 1 : 0);
      }

      if (com.aspose.slides.ms.System.q1.n5(this.e5.f2() - var2.t9()) > 0.001) {
         var1.k5(new com.aspose.slides.internal.b3z.a6(var2.t9(), 9));
      }

      if (var2.l6().u3().u3() > 1) {
         this.n5(var1, var2.l6().u3(), null);
      } else {
         if ((var3.h0() & 16777215) != (var4.h0() & 16777215) || this.r4 != null) {
            var1.u3(new com.aspose.slides.internal.b3z.u3(var3.o8()).toString());
         }

         if ((var3.s7() & 255) != (var4.s7() & 255)) {
            var1.l6(l6(var3.o8()));
         }
      }

      if (var2.l6().z8() != null) {
         var1.l6.n5("lengthAdjust", "spacingAndGlyphs");
      }

      this.n5(var1, var2);
   }

   private static int n5(String var0, boolean var1) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         throw new ArgumentException("textParam.FontName");
      }

      int var2 = var1 ? 700 : 400;
      String[] var3 = com.aspose.slides.ms.System.d1.n5(var0, ' ');

      for (int var4 = 0; var4 < var3.length; var4++) {
         String var5 = var3[var4];
         String var6 = com.aspose.slides.ms.System.d1.u9(var5);
         if (var4 > 0 && a3.containsKey(var6)) {
            return a3.get_Item(var6);
         }
      }

      return var2;
   }

   private void n5(com.aspose.slides.internal.j7h.u3 var1, s5v var2) {
      if (!var2.c8()) {
         int var5 = n5(var2.h0(), var2.c8());
         if (var5 != n5(this.e5.z3(), false)) {
            var1.h0(var5);
         }
      } else {
         e4z var3 = var2.l6().d2();
         if (var3.u9()) {
            c9g var4 = var2.l6().a6;
            if (var4 != null && "zh-CN".equals(var4.getLanguageId())) {
               var1.h0(700);
            } else {
               var1.k5(new com.aspose.slides.internal.b3z.u3(var2.u3().o8()).toString());
               if ((var2.u3().s7() & 255) < 255) {
                  var1.n5(l6(var2.u3().o8()));
               }

               var1.n5(new com.aspose.slides.internal.b3z.a6((float)com.aspose.slides.ms.System.q1.n5((double)(var3.h0() * 0.02F), 2), 9));
               var1.h0(400);
            }
         } else if (var1.f2() >= 400 && var1.f2() < 600) {
            var1.h0(700);
         }
      }
   }

   private void n5(com.aspose.slides.internal.d0e.a6 var1, a1v var2, com.aspose.slides.internal.x4g.s7 var3) {
      if (var2 != null && var2.u3() != 0) {
         switch (var2.u3()) {
            case 1:
            default:
               this.n5(var1, var2.n5().o8());
               break;
            case 2:
               String var7 = this.z3.n5((u4z)var2);
               var1.u3(k5(var7));
               break;
            case 3:
               String var6 = this.z3.n5(this, (m2a)var2);
               var1.u3(k5(var6));
               break;
            case 4:
               q3d var5 = (q3d)var2;
               String var4;
               if (var5.z1() != 1 && (var5.y4() == null || var5.y4().getFillOverlayEffect() == null)) {
                  var4 = this.z3.n5(this, var5);
               } else {
                  var4 = this.z3.n5(this, var5, var3);
               }

               var1.u3(k5(var4));
         }
      } else {
         var1.u3("none");
      }
   }

   private void n5(com.aspose.slides.internal.d0e.a6 var1, a1v var2) {
      if (var2 != null && var2.u3() != 0) {
         switch (var2.u3()) {
            case 1:
            default:
               com.aspose.slides.internal.o9b.c8 var3 = var2.n5().o8();
               var1.k5(new com.aspose.slides.internal.b3z.u3(var3.o8()).toString());
               if ((var3.s7() & 255) < 255) {
                  var1.n5(l6(var3.o8()));
               }
               break;
            case 2:
               String var5 = this.z3.n5((u4z)var2);
               var1.k5(k5(var5));
               break;
            case 3:
               String var4 = this.z3.n5(this, (m2a)var2);
               var1.k5(k5(var4));
         }
      } else {
         var1.k5("none");
      }
   }

   private void l6(com.aspose.slides.internal.d0e.a6 var1) {
      if (this.d5.size() > 0) {
         this.d5.peek().n5(var1);
      } else {
         com.aspose.slides.internal.j7h.l6 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.j7h.l6.class);
         if (var2 != null && com.aspose.slides.ms.System.d1.n5(var2.k7()) && this.f2.size() > 0) {
            var2.h0(this.f2.get_Item(0).getId());
         }

         if (var2 != null && this.p8.size() > 0) {
            for (int var3 = 0; var3 < this.p8.size(); var3++) {
               com.aspose.slides.internal.j7h.l6 var4 = com.aspose.slides.internal.v6g.k5.n5(this.p8.get_Item(var3), com.aspose.slides.internal.j7h.l6.class);
               if (var4 != null
                  && var4.a0().size() > 0
                  && var2.a0().size() > 0
                  && var4.d5().size() > 0
                  && var2.d5().size() > 0
                  && var4.a0().get_Item(0).n5() > var2.a0().get_Item(0).n5()
                  && var4.d5().get_Item(0).n5() == var2.d5().get_Item(0).n5()) {
                  this.p8.insertItem(var3, var2);
                  break;
               }

               if (var3 == this.p8.size() - 1) {
                  this.p8.addItem(var1);
                  break;
               }
            }
         } else {
            this.p8.addItem(var1);
         }
      }
   }

   private void k5(com.aspose.slides.internal.d0e.a6 var1) {
      this.s3.peek().n5(var1);
   }

   private void u3(com.aspose.slides.internal.d0e.a6 var1) {
      this.k5(var1);
      this.s3.push(var1);
   }

   private boolean b3() {
      return this.q0.getDisable3DText();
   }

   private static boolean k5(IHyperlink var0) {
      switch (var0.getActionType()) {
         case 1:
         case 10:
         case 11:
            return !com.aspose.slides.ms.System.d1.n5(var0.getExternalUrl());
         default:
            return false;
      }
   }

   private String o0() {
      return com.aspose.slides.ms.System.d1.n5(new String[]{"tp_", com.aspose.slides.ms.System.a3.n5(this.y2++, "x")});
   }

   public final boolean k5() {
      return this.j5;
   }

   static float l6(com.aspose.slides.internal.o9b.c8 var0) {
      return com.aspose.slides.internal.v6g.k5.u3((var0.s7() & 0xFF) / 255.0 * 100.0 + 0.5, 14) / 100.0F;
   }

   static int n5(float var0) {
      return com.aspose.slides.internal.v6g.k5.u3(var0 + 0.5, 14);
   }

   private static String k5(String var0) {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{"url(#", var0, ')'});
   }

   final float y4() {
      return this.z1;
   }

   final float e2() {
      return this.t4;
   }

   public final SVGOptions z1() {
      return this.q0;
   }

   public final com.aspose.slides.internal.w0.c8 d2() {
      return this.c8;
   }

   final boolean d5() {
      return this.t1;
   }

   final void a6(boolean var1) {
      this.t1 = var1;
   }

   private String n5(u4z var1) {
      String var2 = com.aspose.slides.ms.System.d1.n5(new String[]{
         com.aspose.slides.ms.System.a3.l6(var1.o0().hashCode()),
         com.aspose.slides.ms.System.a3.l6(var1.e2()),
         com.aspose.slides.ms.System.a3.l6(var1.t9()),
         com.aspose.slides.ms.System.a3.l6(var1.n5().h0()),
         com.aspose.slides.ms.System.a3.l6(var1.l6().h0())
      });
      IGenericEnumerator var3 = var1.t4().iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            var2 = com.aspose.slides.ms.System.d1.n5(
               var2,
               com.aspose.slides.ms.System.d1.n5(
                  com.aspose.slides.ms.System.n1.u9((Float)var4.getKey()), ((com.aspose.slides.internal.o9b.c8)var4.getValue()).l6()
               )
            );
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   static {
      f0.addItem("regular", 0);
      f0.addItem("normal", 0);
      f0.addItem("italic", 1);
      f0.addItem("oblique", 2);
      a3.addItem("thin", 100);
      a3.addItem("extralight", 200);
      a3.addItem("semilight", 200);
      a3.addItem("light", 300);
      a3.addItem("book", 300);
      a3.addItem("regular", 400);
      a3.addItem("normal", 400);
      a3.addItem("medium", 500);
      a3.addItem("semibold", 600);
      a3.addItem("demibold", 600);
      a3.addItem("demi", 600);
      a3.addItem("bold", 700);
      a3.addItem("black", 800);
      a3.addItem("extra bold", 800);
      a3.addItem("heavy", 800);
      a3.addItem("extra black", 900);
      a3.addItem("ultra bold", 900);
      p3.addItem("cond", 2);
      p3.addItem("condensed", 2);
      a5.addItem((byte)8, new float[]{1.0F, 1.0F});
      a5.addItem((byte)7, new float[]{3.0F, 1.0F});
      a5.addItem((byte)9, new float[]{3.0F, 1.0F, 1.0F, 1.0F});
      a5.addItem((byte)10, new float[]{3.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F});
      a5.addItem((byte)1, new float[]{1.0F, 3.0F});
      a5.addItem((byte)2, new float[]{4.0F, 3.0F});
      a5.addItem((byte)4, new float[]{4.0F, 3.0F, 1.0F, 3.0F});
      a5.addItem((byte)3, new float[]{8.0F, 3.0F});
      a5.addItem((byte)5, new float[]{8.0F, 3.0F, 1.0F, 3.0F});
      a5.addItem((byte)6, new float[]{8.0F, 3.0F, 1.0F, 3.0F, 1.0F, 3.0F});
   }
}
