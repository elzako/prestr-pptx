package com.aspose.slides.internal.n3;

import com.aspose.slides.internal.k5.k7;
import com.aspose.slides.internal.k5.l6$n5;
import com.aspose.slides.ms.System.d1;

public abstract class k5 extends h0 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> l6 = new com.aspose.slides.internal.u3.c8<>();
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("rgba(", "hsl(", "hsla(");

   @Override
   public com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> a6() {
      return n5;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      switch (var1.n5()) {
         case 12:
            return l6$n5.n5;
         case 24:
            return new com.aspose.slides.internal.y4.t4(var1.t2());
         case 27:
            return l6(var1.c8());
         case 35:
            String var3 = d1.a6(var1.t2());
            com.aspose.slides.internal.k5.u9 var4 = this.a6().n5(var3);
            if (var4 != null) {
               return l6.n5(var3);
            } else if ("none".equals(var3)) {
               return l6$n5.a0;
            } else if ("currentcolor".equals(var3)) {
               return l6$n5.b4j;
            } else {
               if ("initial".equals(var3)) {
                  return l6$n5.y8;
               }

               throw this.n5(var1.t2());
            }
         case 41:
            switch (k5.n5(d1.a6(var1.h0()))) {
               case 0:
                  return k5(var1.c8());
               case 1:
                  return u3(var1.c8());
               case 2:
                  return a6(var1.c8());
               default:
                  throw this.n5(var1.n5());
            }
         default:
            throw this.n5(var1.n5());
      }
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(
      k7 var1, com.aspose.slides.internal.h0.h0 var2, String var3, com.aspose.slides.internal.y4.z1 var4, com.aspose.slides.internal.k5.u9 var5, int var6
   ) {
      if (l6$n5.b4j == var5) {
         int var7 = var2.u3(72);
         if (var6 == var7) {
            k7 var8 = com.aspose.slides.internal.h0.h0.n5(com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.j3.z3.class));
            return var8 == null ? this.u3() : var2.n5(var8, var3, var7);
         } else {
            return var2.n5(var1, var3, var7);
         }
      } else {
         return super.n5(var1, var2, var3, var4, var5, var6);
      }
   }

   private static com.aspose.slides.internal.k5.u9 l6(com.aspose.slides.internal.z8.y4 var0) {
      int var1 = n5(var0.u9(), var0.n5() == 23);
      var0 = var0.k5();
      if (var0.n5() == 0) {
         var0 = var0.k5();
      }

      int var2 = n5(var0.u9(), var0.n5() == 23);
      var0 = var0.k5();
      if (var0.n5() == 0) {
         var0 = var0.k5();
      }

      int var3 = n5(var0.u9(), var0.n5() == 23);
      return com.aspose.slides.internal.y4.y4.n5(var1, var2, var3);
   }

   private static com.aspose.slides.internal.k5.u9 k5(com.aspose.slides.internal.z8.y4 var0) {
      int var1 = n5(var0.u9(), var0.n5() == 23);
      var0 = var0.k5().k5();
      int var2 = n5(var0.u9(), var0.n5() == 23);
      var0 = var0.k5().k5();
      int var3 = n5(var0.u9(), var0.n5() == 23);
      var0 = var0.k5().k5();
      float var4 = n5(com.aspose.slides.internal.v6g.k5.u3(var0.u9() * 255.0F, 13), var0.n5() == 23);
      return com.aspose.slides.internal.y4.y4.n5(var4, var1, var2, var3);
   }

   private static com.aspose.slides.internal.k5.u9 u3(com.aspose.slides.internal.z8.y4 var0) {
      float var1 = var0.u9() / 360.0F;
      var0 = var0.k5().k5();
      float var2 = var0.u9() / 100.0F;
      var0 = var0.k5().k5();
      float var3 = var0.u9() / 100.0F;
      com.aspose.slides.internal.o9b.c8 var4 = n5(var1, var2, var3, 1.0F).o8();
      return (var4.s7() & 255) == 255
         ? com.aspose.slides.internal.y4.y4.n5(var4.x8() & 0xFF, var4.n3() & 0xFF, var4.y4() & 0xFF)
         : com.aspose.slides.internal.y4.y4.n5(var4.s7() & 0xFF, var4.x8() & 0xFF, var4.n3() & 0xFF, var4.y4() & 0xFF);
   }

   private static com.aspose.slides.internal.k5.u9 a6(com.aspose.slides.internal.z8.y4 var0) {
      float var1 = var0.u9() / 360.0F;
      var0 = var0.k5().k5();
      float var2 = var0.u9() / 100.0F;
      var0 = var0.k5().k5();
      float var3 = var0.u9() / 100.0F;
      var0 = var0.k5().k5();
      float var4 = var0.u9();
      com.aspose.slides.internal.o9b.c8 var5 = n5(var1, var2, var3, var4).o8();
      return (var5.s7() & 255) == 255
         ? com.aspose.slides.internal.y4.y4.n5(var5.x8() & 0xFF, var5.n3() & 0xFF, var5.y4() & 0xFF)
         : com.aspose.slides.internal.y4.y4.n5(var5.s7() & 0xFF, var5.x8() & 0xFF, var5.n3() & 0xFF, var5.y4() & 0xFF);
   }

   private static int n5(float var0, boolean var1) {
      if (!var1) {
         if (var0 < 0.0F) {
            return 0;
         } else {
            return var0 > 255.0F ? 255 : com.aspose.slides.internal.v6g.k5.u3(var0, 13);
         }
      } else {
         if (var0 < 0.0F) {
            var0 = 0.0F;
         }

         if (var0 > 100.0F) {
            var0 = 100.0F;
         }

         return com.aspose.slides.internal.v6g.k5.u3(var0 * 255.0F / 100.0F, 13);
      }
   }

   private static com.aspose.slides.internal.o9b.c8 n5(float var0, float var1, float var2, float var3) {
      float var4 = var2 < 0.5 ? var2 * (1.0F + var1) : var2 + var1 - var1 * var2;
      float var5 = var2 * 2.0F - var4;
      byte var6 = com.aspose.slides.internal.v6g.k5.n5((Object)(n5(var5, var4, var0 + 0.33333334F) * 255.0F), 13);
      byte var7 = com.aspose.slides.internal.v6g.k5.n5((Object)(n5(var5, var4, var0) * 255.0F), 13);
      byte var8 = com.aspose.slides.internal.v6g.k5.n5((Object)(n5(var5, var4, var0 - 0.33333334F) * 255.0F), 13);
      return com.aspose.slides.internal.o9b.c8.n5(com.aspose.slides.internal.v6g.k5.u3(var3 * 255.0F, 13), var6 & 255, var7 & 255, var8 & 255);
   }

   private static float n5(float var0, float var1, float var2) {
      if (var2 < 0.0F) {
         var2++;
      }

      if (var2 > 1.0F) {
         var2--;
      }

      if (6.0F * var2 < 1.0F) {
         return var0 + (var1 - var0) * var2 * 6.0F;
      } else if (2.0F * var2 < 1.0F) {
         return var1;
      } else {
         return 3.0F * var2 < 2.0F ? var0 + (var1 - var0) * (0.6666667F - var2) * 6.0F : var0;
      }
   }

   static {
      n5.n5("aliceblue", l6$n5.e2l);
      n5.n5("antiquewhite", l6$n5.v2x);
      n5.n5("aqua", l6$n5.y9r);
      n5.n5("aquamarine", l6$n5.u7c);
      n5.n5("azure", l6$n5.x2y);
      n5.n5("beige", l6$n5.x5h);
      n5.n5("bisque", l6$n5.s0i);
      n5.n5("black", l6$n5.l4o);
      n5.n5("blanchedalmond", l6$n5.a2w);
      n5.n5("blue", l6$n5.w3k);
      n5.n5("blueviolet", l6$n5.b1r);
      n5.n5("brown", l6$n5.y2o);
      n5.n5("burlywood", l6$n5.r2n);
      n5.n5("cadetblue", l6$n5.s7k);
      n5.n5("chartreuse", l6$n5.d7u);
      n5.n5("chocolate", l6$n5.j3b);
      n5.n5("coral", l6$n5.o9i);
      n5.n5("cornflowerblue", l6$n5.a1k);
      n5.n5("cornsilk", l6$n5.k5w);
      n5.n5("crimson", l6$n5.k4o);
      n5.n5("cyan", l6$n5.v4m);
      n5.n5("darkblue", l6$n5.j3z);
      n5.n5("darkcyan", l6$n5.f4l);
      n5.n5("darkgoldenrod", l6$n5.s5r);
      n5.n5("darkgray", l6$n5.g5d);
      n5.n5("darkgreen", l6$n5.u0b);
      n5.n5("darkgrey", l6$n5.c4i);
      n5.n5("darkkhaki", l6$n5.m2n);
      n5.n5("darkmagenta", l6$n5.e2o);
      n5.n5("darkolivegreen", l6$n5.m0l);
      n5.n5("darkorange", l6$n5.a1g);
      n5.n5("darkorchid", l6$n5.q5v);
      n5.n5("darkred", l6$n5.t1h);
      n5.n5("darksalmon", l6$n5.i8n);
      n5.n5("darkseagreen", l6$n5.k0y);
      n5.n5("darkslateblue", l6$n5.v7o);
      n5.n5("darkslategray", l6$n5.x5e);
      n5.n5("darkslategrey", l6$n5.r1x);
      n5.n5("darkturquoise", l6$n5.y4u);
      n5.n5("darkviolet", l6$n5.f9d);
      n5.n5("deeppink", l6$n5.g3j);
      n5.n5("deepskyblue", l6$n5.z3b);
      n5.n5("dimgray", l6$n5.r1q);
      n5.n5("dimgrey", l6$n5.h6t);
      n5.n5("dodgerblue", l6$n5.d0c);
      n5.n5("firebrick", l6$n5.b7s);
      n5.n5("floralwhite", l6$n5.n5p);
      n5.n5("forestgreen", l6$n5.a2p);
      n5.n5("fuchsia", l6$n5.l4w);
      n5.n5("gainsboro", l6$n5.l3e);
      n5.n5("ghostwhite", l6$n5.j8o);
      n5.n5("gold", l6$n5.e8b);
      n5.n5("goldenrod", l6$n5.q6r);
      n5.n5("gray", l6$n5.o7b);
      n5.n5("green", l6$n5.z8m);
      n5.n5("greenyellow", l6$n5.t7p);
      n5.n5("grey", l6$n5.u2w);
      n5.n5("honeydew", l6$n5.o2b);
      n5.n5("hotpink", l6$n5.q4o);
      n5.n5("indianred", l6$n5.k0b);
      n5.n5("indigo", l6$n5.t2d);
      n5.n5("ivory", l6$n5.h9s);
      n5.n5("khaki", l6$n5.r2q);
      n5.n5("lavender", l6$n5.t3h);
      n5.n5("lavenderblush", l6$n5.t6g);
      n5.n5("lawngreen", l6$n5.o9n);
      n5.n5("lemonchiffon", l6$n5.y7w);
      n5.n5("lightblue", l6$n5.d3v);
      n5.n5("lightcoral", l6$n5.e0w);
      n5.n5("lightcyan", l6$n5.d3c);
      n5.n5("lightgoldenrodyellow", l6$n5.w2a);
      n5.n5("lightgray", l6$n5.r6o);
      n5.n5("lightgreen", l6$n5.v6s);
      n5.n5("lightgrey", l6$n5.k7m);
      n5.n5("lightpink", l6$n5.f2i);
      n5.n5("lightsalmon", l6$n5.e4j);
      n5.n5("lightseagreen", l6$n5.n9a);
      n5.n5("lightskyblue", l6$n5.i4w);
      n5.n5("lightslategray", l6$n5.o7p);
      n5.n5("lightslategrey", l6$n5.a3p);
      n5.n5("lightsteelblue", l6$n5.q0g);
      n5.n5("lightyellow", l6$n5.g7i);
      n5.n5("lime", l6$n5.d3l);
      n5.n5("limegreen", l6$n5.u7q);
      n5.n5("linen", l6$n5.d9l);
      n5.n5("magenta", l6$n5.w2i);
      n5.n5("maroon", l6$n5.d8y);
      n5.n5("mediumaquamarine", l6$n5.q0y);
      n5.n5("mediumblue", l6$n5.w2v);
      n5.n5("mediumorchid", l6$n5.p5w);
      n5.n5("mediumpurple", l6$n5.g7e);
      n5.n5("mediumseagreen", l6$n5.b8u);
      n5.n5("mediumslateblue", l6$n5.l1f);
      n5.n5("mediumspringgreen", l6$n5.d9r);
      n5.n5("mediumturquoise", l6$n5.w3u);
      n5.n5("mediumvioletred", l6$n5.l0u);
      n5.n5("midnightblue", l6$n5.v2r);
      n5.n5("mintcream", l6$n5.t6q);
      n5.n5("mistyrose", l6$n5.c5i);
      n5.n5("moccasin", l6$n5.u3r);
      n5.n5("navajowhite", l6$n5.c9v);
      n5.n5("navy", l6$n5.r0w);
      n5.n5("oldlace", l6$n5.n3o);
      n5.n5("olive", l6$n5.i5k);
      n5.n5("olivedrab", l6$n5.c8q);
      n5.n5("orange", l6$n5.w1g);
      n5.n5("orangered", l6$n5.c3g);
      n5.n5("orchid", l6$n5.g4d);
      n5.n5("palegoldenrod", l6$n5.l3a);
      n5.n5("palegreen", l6$n5.a0q);
      n5.n5("paleturquoise", l6$n5.w3o);
      n5.n5("palevioletred", l6$n5.n9p);
      n5.n5("papayawhip", l6$n5.c0h);
      n5.n5("peachpuff", l6$n5.n6h);
      n5.n5("peru", l6$n5.t7q);
      n5.n5("pink", l6$n5.l9a);
      n5.n5("plum", l6$n5.h5r);
      n5.n5("powderblue", l6$n5.a4s);
      n5.n5("purple", l6$n5.v0v);
      n5.n5("red", l6$n5.e5q);
      n5.n5("rosybrown", l6$n5.c4z);
      n5.n5("royalblue", l6$n5.j6e);
      n5.n5("saddlebrown", l6$n5.c5e);
      n5.n5("salmon", l6$n5.f7v);
      n5.n5("sandybrown", l6$n5.e3j);
      n5.n5("seagreen", l6$n5.v2c);
      n5.n5("seashell", l6$n5.s0c);
      n5.n5("sienna", l6$n5.u5b);
      n5.n5("silver", l6$n5.x8w);
      n5.n5("skyblue", l6$n5.i2i);
      n5.n5("slateblue", l6$n5.b5x);
      n5.n5("slategray", l6$n5.y4g);
      n5.n5("slategrey", l6$n5.j0e);
      n5.n5("snow", l6$n5.t5n);
      n5.n5("springgreen", l6$n5.z6y);
      n5.n5("steelblue", l6$n5.a9t);
      n5.n5("tan", l6$n5.q8o);
      n5.n5("teal", l6$n5.n4m);
      n5.n5("thistle", l6$n5.m9a);
      n5.n5("tomato", l6$n5.a6z);
      n5.n5("turquoise", l6$n5.n6d);
      n5.n5("violet", l6$n5.w2f);
      n5.n5("wheat", l6$n5.v2o);
      n5.n5("white", l6$n5.f3h);
      n5.n5("whitesmoke", l6$n5.a0p);
      n5.n5("yellow", l6$n5.h0y);
      n5.n5("yellowgreen", l6$n5.t7k);
      n5.n5("transparent", l6$n5.q9r);
      n5.n5("activeborder", l6$n5.k6r);
      n5.n5("activecaption", l6$n5.p2n);
      n5.n5("appworkspace", l6$n5.h2v);
      n5.n5("background", l6$n5.d1z);
      n5.n5("buttonface", l6$n5.x1j);
      n5.n5("buttonhighlight", l6$n5.e6q);
      n5.n5("buttonshadow", l6$n5.w9c);
      n5.n5("buttontext", l6$n5.t9z);
      n5.n5("captiontext", l6$n5.v1y);
      n5.n5("graytext", l6$n5.x7u);
      n5.n5("highlight", l6$n5.t4p);
      n5.n5("highlighttext", l6$n5.m5k);
      n5.n5("inactiveborder", l6$n5.x2o);
      n5.n5("inactivecaption", l6$n5.w9n);
      n5.n5("inactivecaptiontext", l6$n5.a8e);
      n5.n5("infobackground", l6$n5.l6s);
      n5.n5("infotext", l6$n5.p6x);
      n5.n5("menu", l6$n5.z3o);
      n5.n5("menutext", l6$n5.o8r);
      n5.n5("scrollbar", l6$n5.v9l);
      n5.n5("threeddarkshadow", l6$n5.w1y);
      n5.n5("threedface", l6$n5.i1t);
      n5.n5("threedhighlight", l6$n5.k3w);
      n5.n5("threedlightshadow", l6$n5.g7p);
      n5.n5("threedshadow", l6$n5.w2k);
      n5.n5("window", l6$n5.z5p);
      n5.n5("windowframe", l6$n5.n1b);
      n5.n5("windowtext", l6$n5.q6f);
      l6.n5("aliceblue", l6$n5.t6w);
      l6.n5("antiquewhite", l6$n5.z5z);
      l6.n5("aqua", l6$n5.y8b);
      l6.n5("aquamarine", l6$n5.w4c);
      l6.n5("azure", l6$n5.o1o);
      l6.n5("beige", l6$n5.h9q);
      l6.n5("bisque", l6$n5.p5g);
      l6.n5("black", l6$n5.u1n);
      l6.n5("blanchedalmond", l6$n5.o6x);
      l6.n5("blue", l6$n5.p5x);
      l6.n5("blueviolet", l6$n5.p9w);
      l6.n5("brown", l6$n5.a9y);
      l6.n5("burlywood", l6$n5.b1m);
      l6.n5("cadetblue", l6$n5.t2h);
      l6.n5("chartreuse", l6$n5.v4y);
      l6.n5("chocolate", l6$n5.p0s);
      l6.n5("coral", l6$n5.g0t);
      l6.n5("cornflowerblue", l6$n5.q2c);
      l6.n5("cornsilk", l6$n5.w1c);
      l6.n5("crimson", l6$n5.r3x);
      l6.n5("cyan", l6$n5.y4x);
      l6.n5("darkblue", l6$n5.g3x);
      l6.n5("darkcyan", l6$n5.b9b);
      l6.n5("darkgoldenrod", l6$n5.d9v);
      l6.n5("darkgray", l6$n5.l9o);
      l6.n5("darkgreen", l6$n5.p4t);
      l6.n5("darkgrey", l6$n5.c9q);
      l6.n5("darkkhaki", l6$n5.l6j);
      l6.n5("darkmagenta", l6$n5.t3o);
      l6.n5("darkolivegreen", l6$n5.o3n);
      l6.n5("darkorange", l6$n5.o8x);
      l6.n5("darkorchid", l6$n5.v7y);
      l6.n5("darkred", l6$n5.l6o);
      l6.n5("darksalmon", l6$n5.v6g);
      l6.n5("darkseagreen", l6$n5.k0r);
      l6.n5("darkslateblue", l6$n5.c8m);
      l6.n5("darkslategray", l6$n5.k4y);
      l6.n5("darkslategrey", l6$n5.n8e);
      l6.n5("darkturquoise", l6$n5.l6z);
      l6.n5("darkviolet", l6$n5.n1n);
      l6.n5("deeppink", l6$n5.b5j);
      l6.n5("deepskyblue", l6$n5.k2s);
      l6.n5("dimgray", l6$n5.b8n);
      l6.n5("dimgrey", l6$n5.w9s);
      l6.n5("dodgerblue", l6$n5.h0i);
      l6.n5("firebrick", l6$n5.f5n);
      l6.n5("floralwhite", l6$n5.d0e);
      l6.n5("forestgreen", l6$n5.u3t);
      l6.n5("fuchsia", l6$n5.b3z);
      l6.n5("gainsboro", l6$n5.a3s);
      l6.n5("ghostwhite", l6$n5.k7d);
      l6.n5("gold", l6$n5.f7k);
      l6.n5("goldenrod", l6$n5.w5i);
      l6.n5("gray", l6$n5.z9u);
      l6.n5("green", l6$n5.a3k);
      l6.n5("greenyellow", l6$n5.i1k);
      l6.n5("grey", l6$n5.d8v);
      l6.n5("honeydew", l6$n5.j7h);
      l6.n5("hotpink", l6$n5.b9j);
      l6.n5("indianred", l6$n5.n2d);
      l6.n5("indigo", l6$n5.h3k);
      l6.n5("ivory", l6$n5.p1s);
      l6.n5("khaki", l6$n5.s9c);
      l6.n5("lavender", l6$n5.s8x);
      l6.n5("lavenderblush", l6$n5.e5m);
      l6.n5("lawngreen", l6$n5.k4d);
      l6.n5("lemonchiffon", l6$n5.t6j);
      l6.n5("lightblue", l6$n5.e1x);
      l6.n5("lightcoral", l6$n5.v3s);
      l6.n5("lightcyan", l6$n5.c4y);
      l6.n5("lightgoldenrodyellow", l6$n5.w4s);
      l6.n5("lightgray", l6$n5.c8e);
      l6.n5("lightgreen", l6$n5.e6s);
      l6.n5("lightgrey", l6$n5.x4q);
      l6.n5("lightpink", l6$n5.p2h);
      l6.n5("lightsalmon", l6$n5.n3p);
      l6.n5("lightseagreen", l6$n5.q1y);
      l6.n5("lightskyblue", l6$n5.n8n);
      l6.n5("lightslategray", l6$n5.r2o);
      l6.n5("lightslategrey", l6$n5.v1w);
      l6.n5("lightsteelblue", l6$n5.d4r);
      l6.n5("lightyellow", l6$n5.b1k);
      l6.n5("lime", l6$n5.v3y);
      l6.n5("limegreen", l6$n5.w8s);
      l6.n5("linen", l6$n5.w2p);
      l6.n5("magenta", l6$n5.d2x);
      l6.n5("maroon", l6$n5.a8m);
      l6.n5("mediumaquamarine", l6$n5.a9w);
      l6.n5("mediumblue", l6$n5.g1i);
      l6.n5("mediumorchid", l6$n5.b3r);
      l6.n5("mediumpurple", l6$n5.s7m);
      l6.n5("mediumseagreen", l6$n5.y8i);
      l6.n5("mediumslateblue", l6$n5.e5k);
      l6.n5("mediumspringgreen", l6$n5.t7m);
      l6.n5("mediumturquoise", l6$n5.l4s);
      l6.n5("mediumvioletred", l6$n5.z9j);
      l6.n5("midnightblue", l6$n5.h6m);
      l6.n5("mintcream", l6$n5.q7j);
      l6.n5("mistyrose", l6$n5.i4u);
      l6.n5("moccasin", l6$n5.j7d);
      l6.n5("navajowhite", l6$n5.v4b);
      l6.n5("navy", l6$n5.f2z);
      l6.n5("oldlace", l6$n5.d1t);
      l6.n5("olive", l6$n5.f7o);
      l6.n5("olivedrab", l6$n5.u1u);
      l6.n5("orange", l6$n5.z7r);
      l6.n5("orangered", l6$n5.e9b);
      l6.n5("orchid", l6$n5.g0e);
      l6.n5("palegoldenrod", l6$n5.b9q);
      l6.n5("palegreen", l6$n5.n4b);
      l6.n5("paleturquoise", l6$n5.t3c);
      l6.n5("palevioletred", l6$n5.r2t);
      l6.n5("papayawhip", l6$n5.y1i);
      l6.n5("peachpuff", l6$n5.o3h);
      l6.n5("peru", l6$n5.b1g);
      l6.n5("pink", l6$n5.x9p);
      l6.n5("plum", l6$n5.i4k);
      l6.n5("powderblue", l6$n5.u3n);
      l6.n5("purple", l6$n5.w2z);
      l6.n5("red", l6$n5.j5s);
      l6.n5("rosybrown", l6$n5.w7e);
      l6.n5("royalblue", l6$n5.b7i);
      l6.n5("saddlebrown", l6$n5.f6a);
      l6.n5("salmon", l6$n5.f4q);
      l6.n5("sandybrown", l6$n5.r2r);
      l6.n5("seagreen", l6$n5.t4e);
      l6.n5("seashell", l6$n5.j2k);
      l6.n5("sienna", l6$n5.m3e);
      l6.n5("silver", l6$n5.x9f);
      l6.n5("skyblue", l6$n5.n9v);
      l6.n5("slateblue", l6$n5.o8n);
      l6.n5("slategray", l6$n5.w0r);
      l6.n5("slategrey", l6$n5.t7d);
      l6.n5("snow", l6$n5.f1i);
      l6.n5("springgreen", l6$n5.y8s);
      l6.n5("steelblue", l6$n5.l9e);
      l6.n5("tan", l6$n5.m0a);
      l6.n5("teal", l6$n5.a1v);
      l6.n5("thistle", l6$n5.o3m);
      l6.n5("tomato", l6$n5.e5s);
      l6.n5("turquoise", l6$n5.u4x);
      l6.n5("violet", l6$n5.m1y);
      l6.n5("wheat", l6$n5.x0d);
      l6.n5("white", l6$n5.x1i);
      l6.n5("whitesmoke", l6$n5.x4t);
      l6.n5("yellow", l6$n5.d6z);
      l6.n5("yellowgreen", l6$n5.r0s);
      l6.n5("transparent", l6$n5.q9l);
      l6.n5("activeborder", l6$n5.a9k);
      l6.n5("activecaption", l6$n5.p4u);
      l6.n5("appworkspace", l6$n5.i0c);
      l6.n5("background", l6$n5.k1i);
      l6.n5("buttonface", l6$n5.q8h);
      l6.n5("buttonhighlight", l6$n5.e8j);
      l6.n5("buttonshadow", l6$n5.k1b);
      l6.n5("buttontext", l6$n5.t7b);
      l6.n5("captiontext", l6$n5.t2a);
      l6.n5("graytext", l6$n5.y8d);
      l6.n5("highlight", l6$n5.c7h);
      l6.n5("highlighttext", l6$n5.j6b);
      l6.n5("inactiveborder", l6$n5.f9o);
      l6.n5("inactivecaption", l6$n5.d4p);
      l6.n5("inactivecaptiontext", l6$n5.v2p);
      l6.n5("infobackground", l6$n5.u7o);
      l6.n5("infotext", l6$n5.y3s);
      l6.n5("menu", l6$n5.m1c);
      l6.n5("menutext", l6$n5.v6k);
      l6.n5("scrollbar", l6$n5.d1g);
      l6.n5("threeddarkshadow", l6$n5.v8y);
      l6.n5("threedface", l6$n5.f5m);
      l6.n5("threedhighlight", l6$n5.f3r);
      l6.n5("threedlightshadow", l6$n5.u3y);
      l6.n5("threedshadow", l6$n5.n1u);
      l6.n5("window", l6$n5.v3w);
      l6.n5("windowframe", l6$n5.w5y);
      l6.n5("windowtext", l6$n5.a4e);
   }
}
