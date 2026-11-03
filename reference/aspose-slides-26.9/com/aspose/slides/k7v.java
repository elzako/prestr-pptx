package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;

class k7v {
   private final SvgImage n5;
   private com.aspose.slides.internal.b5j.h0 l6;
   private com.aspose.slides.internal.b5j.x8 k5;
   private Dictionary<String, IGenericDictionary<String, String>> u3;
   private com.aspose.slides.internal.b5j.u9 a6;
   private String u9;
   private String h0;
   private u1g c8;
   private w5w t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "text", "tspan", "rect", "circle", "ellipse", "line", "polyline", "polygon", "path"
   );

   final u1g n5() {
      return this.c8;
   }

   private void n5(u1g var1) {
      this.c8 = var1;
   }

   final w5w l6() {
      return this.t2;
   }

   private void n5(w5w var1) {
      this.t2 = var1;
   }

   public k7v(IShape var1, ISvgImage var2) {
      this.n5 = (SvgImage)var2;
      this.n5(new u1g(var1));
      this.n5(new w5w(var1));
      this.u9 = this.h0 = com.aspose.slides.ms.System.d1.n5;
   }

   final ISvgImage k5() {
      this.a6();
      return this.l6().n5() && this.n5().n5() ? this.n5 : this.u3();
   }

   private void a6() {
      com.aspose.slides.internal.d0e.s7 var1 = this.n5(this.n5.n5());
      com.aspose.slides.internal.d0e.t2 var2 = var1.u9;
      if (this.a6.n5() != null) {
         IGenericEnumerator var3 = this.a6.n5().l6().iterator();

         try {
            while (var3.hasNext()) {
               com.aspose.slides.internal.k5.q0 var4 = (com.aspose.slides.internal.k5.q0)var3.next();
               this.l6.n5(var4.l6());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }

      Dictionary$Enumerator var14 = this.l6.n5().iterator();

      try {
         while (var14.hasNext()) {
            KeyValuePair var15 = (KeyValuePair)var14.next();
            int var5 = com.aspose.slides.ms.System.d1.c8((String)var15.getKey(), ".MsftOfcThm");
            int var6 = com.aspose.slides.ms.System.d1.c8((String)var15.getKey(), "Fill");
            if (var5 >= 0 && var6 >= 0) {
               this.n5(this.n5(), (String)var15.getKey(), var6);
            }

            var6 = com.aspose.slides.ms.System.d1.c8((String)var15.getKey(), "Stroke");
            if (var5 >= 0 && var6 >= 0) {
               this.n5(this.l6(), (String)var15.getKey(), var6);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      this.k5(var2);
   }

   private void n5(u1g var1, String var2, int var3) {
      String var4 = com.aspose.slides.ms.System.d1.l6(var2, 0, var3 - 1);
      String[] var5 = com.aspose.slides.ms.System.d1.n5(var4, new char[]{'_'}, (short)0);
      if (var5.length % 2 > 0) {
         throw new com.aspose.slides.internal.d0e.h0(0, "Invalid SvgMsStyle", var2);
      }

      float var6 = 0.0F;

      for (int var7 = 0; var7 < var5.length; var7 += 2) {
         if (".MsftOfcThm".equals(var5[var7])) {
            String var8 = com.aspose.slides.ms.System.d1.n5(var5[var7 + 1], "Main", "");
            if (com.aspose.slides.ms.System.d1.n5(var8)) {
               var8 = "NotDefined";
            }

            Long var9 = com.aspose.slides.ms.System.d5.parse(com.aspose.slides.internal.v6g.k5.n5(SchemeColor.class), var8);
            var1.n5(var9.intValue());
         } else if ("lumMod".equals(var5[var7])) {
            float[] var10 = new float[]{var6};
            boolean var12 = com.aspose.slides.ms.System.n1.n5(var5[var7 + 1], var10);
            var6 = var10[0];
            if (var12) {
               var1.l6(var6 / 100.0F);
            }
         } else if ("lumOff".equals(var5[var7])) {
            float[] var11 = new float[]{var6};
            boolean var13 = com.aspose.slides.ms.System.n1.n5(var5[var7 + 1], var11);
            var6 = var11[0];
            if (var13) {
               var1.k5(var6 / 100.0F);
            }
         }
      }

      var1.n5((byte)1);
      if (com.aspose.slides.ms.System.d1.k5(var2, "_v2")) {
         var1.n5(true);
      }
   }

   private void n5(com.aspose.slides.internal.d0e.t2 var1) {
      com.aspose.slides.internal.d0e.k5 var2 = var1.l6;
      this.n5(var1, var2);
   }

   private void n5(com.aspose.slides.internal.d0e.t2 var1, IGenericDictionary<String, String> var2) {
      for (int var3 = 0; var3 < var1.j5().n5(); var3++) {
         com.aspose.slides.internal.d0e.t2 var4 = var1.j5().l6(var3);
         if (!"clipPath".equals(var4.u9)) {
            IGenericEnumerator var5 = var2.iterator();

            try {
               while (var5.hasNext()) {
                  KeyValuePair var6 = (KeyValuePair)var5.next();
                  if (var4.l6.n5((String)var6.getKey())) {
                     if (com.aspose.slides.ms.System.d1.a6(var4.l6.k5((String)var6.getKey()), (String)var6.getValue())) {
                        var4.l6.l6((String)var6.getKey());
                     } else if ("transform".equals(var6.getKey())
                        && com.aspose.slides.ms.System.d1.l6(var4.l6.k5("transform"), (String)var2.get_Item("transform"))) {
                        String var7 = com.aspose.slides.ms.System.d1.l6(
                           com.aspose.slides.ms.System.d1.n5(var4.l6.k5("transform"), 0, ((String)var2.get_Item("transform")).length())
                        );
                        if (com.aspose.slides.ms.System.d1.n5(var7)) {
                           var4.l6.l6("transform");
                           var3--;
                        } else {
                           var4.l6.l6("transform", var7);
                        }
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  var5.dispose();
               }
            }

            this.n5(var4, var2);
         }
      }
   }

   public final ISvgImage u3() {
      String var1 = this.u9();
      com.aspose.slides.internal.d0e.s7 var2 = this.n5(this.n5.n5());
      com.aspose.slides.internal.d0e.t2 var3 = var2.u9;
      this.n5(var3, new k7v$1(this));
      this.n5(var2, var1);
      if (!this.u9.isEmpty() || !this.h0.isEmpty()) {
         this.n5(var3, new k7v$2(this));
      }

      return new SvgImage(com.aspose.slides.internal.n1n.u3.n5(var2), this.n5.getExternalResourceResolver(), this.n5.getBaseUri());
   }

   private String u9() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      this.u9 = this.h0();
      if (!this.u9.isEmpty()) {
         var1.n5(this.u9);
         var1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{" {\n fill:", this.n5().u3(), ";\n}\n"}));
         this.u9 = com.aspose.slides.ms.System.d1.n5(this.u9, ".", com.aspose.slides.ms.System.d1.n5);
      }

      this.h0 = this.c8();
      if (!this.h0.isEmpty()) {
         var1.n5(this.h0);
         var1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{" {\n stroke:", this.l6().u3(), ";\n}\n"}));
         this.h0 = com.aspose.slides.ms.System.d1.n5(this.u9, ".", com.aspose.slides.ms.System.d1.n5);
      }

      return var1.toString();
   }

   private String h0() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      if (this.n5().l6() == 1 && this.n5().a6() != -1) {
         var1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{".MsftOfcThm", "_", com.aspose.slides.ms.System.s3.n5(SchemeColor.class, this.n5().a6()), "_"}));
         if (!com.aspose.slides.ms.System.n1.k5(this.n5().h0())) {
            int var2 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.n5().h0() * 100.0F), 14);
            var1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"lumMod", "_", com.aspose.slides.ms.System.a3.l6(var2), "_"}));
         }

         if (!com.aspose.slides.ms.System.n1.k5(this.n5().c8())) {
            int var3 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.n5().c8() * 100.0F), 14);
            var1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"lumOff", "_", com.aspose.slides.ms.System.a3.l6(var3), "_"}));
         }

         var1.n5("Fill");
         if (this.n5().t2()) {
            var1.n5("_v2");
         }

         return var1.toString();
      } else {
         return com.aspose.slides.ms.System.d1.n5;
      }
   }

   private String c8() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      if (this.l6().l6() == 1 && this.l6().a6() != -1) {
         var1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{".MsftOfcThm", "_", com.aspose.slides.ms.System.s3.n5(SchemeColor.class, this.l6().a6()), "_"}));
         if (!com.aspose.slides.ms.System.n1.k5(this.l6().h0())) {
            int var2 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.l6().h0() * 100.0F), 14);
            var1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"lumMod", "_", com.aspose.slides.ms.System.a3.l6(var2), "_"}));
         }

         if (!com.aspose.slides.ms.System.n1.k5(this.l6().c8())) {
            int var3 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.l6().c8() * 100.0F), 14);
            var1.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"lumOff", "_", com.aspose.slides.ms.System.a3.l6(var3), "_"}));
         }

         var1.n5("Stroke");
         if (this.l6().t2()) {
            var1.n5("_v2");
         }

         return var1.toString();
      } else {
         return com.aspose.slides.ms.System.d1.n5;
      }
   }

   private void n5(com.aspose.slides.internal.d0e.s7 var1, String var2) {
      com.aspose.slides.internal.d8v.a6 var3 = var1.n5();

      for (int var4 = 0; var4 < var3.j5().n5(); var4++) {
         com.aspose.slides.internal.d0e.t2 var5 = var3.j5().l6(var4);
         if ("style".equals(var5.u9) && var5.l6.size() == 0) {
            var3.j5().n5(var4);
            break;
         }
      }

      if (!com.aspose.slides.ms.System.d1.n5(var2)) {
         com.aspose.slides.internal.d0e.t2 var6 = new com.aspose.slides.internal.d0e.t2("style", new com.aspose.slides.internal.d0e.k5(), var1.u9);
         com.aspose.slides.internal.j7h.n5 var7 = new com.aspose.slides.internal.j7h.n5(var2);
         var6.n5(var7);
         var3.j5().l6(0, var6);
      }
   }

   private void n5(com.aspose.slides.internal.d0e.t2 var1, k1k var2) {
      for (int var3 = 0; var3 < var1.j5().n5(); var3++) {
         com.aspose.slides.internal.d0e.t2 var4 = var1.j5().l6(var3);
         if (com.aspose.slides.internal.b5j.y4.n5(var4)) {
            String var5 = var4.l6.k5("visibility");
            if (!com.aspose.slides.ms.System.d1.u3("hidden", var5, (short)3) && !com.aspose.slides.ms.System.d1.u3("collapse", var5, (short)3)) {
               String var6 = var4.l6.k5("display");
               if (!com.aspose.slides.ms.System.d1.u3("none", var6, (short)3)) {
                  var2.n5(var4);
                  this.n5(var4, var2);
               }
            }
         }
      }
   }

   private void l6(com.aspose.slides.internal.d0e.t2 var1) {
      if (var1 != null) {
         if (!"svg".equals(var1.u9)) {
            String var2 = null;
            String[] var3 = new String[]{var2};
            boolean var4 = !var1.l6.n5("class", var3);
            var2 = var3[0];
            if (!var4) {
               if (!this.n5().n5() && com.aspose.slides.ms.System.d1.t2(var2, this.u9)) {
                  var1.l6.l6("fill", this.n5().u3());
                  if (!com.aspose.slides.ms.System.n1.k5(this.n5().u9())) {
                     var1.l6.l6("fill-opacity", com.aspose.slides.ms.System.n1.n5(this.n5().u9(), com.aspose.slides.internal.x7n.l6.k5()));
                  }
               }

               if (!this.l6().n5() && com.aspose.slides.ms.System.d1.t2(var2, this.h0)) {
                  var1.l6.l6("stroke", this.l6().u3());
                  if (!com.aspose.slides.ms.System.n1.k5(this.l6().u9())) {
                     var1.l6.l6("stroke-opacity", com.aspose.slides.ms.System.n1.n5(this.l6().u9(), com.aspose.slides.internal.x7n.l6.k5()));
                  }

                  if (!com.aspose.slides.ms.System.d2.k5(this.l6().x8())) {
                     var1.l6.l6("stroke-width", com.aspose.slides.ms.System.d2.n5(this.l6().x8(), com.aspose.slides.internal.x7n.l6.k5()));
                  }

                  if (this.l6().n3() != -1 && this.l6().n3() != 0) {
                     var1.l6.l6("stroke-linecap");
                     var1.l6.l6("stroke-dasharray", n1w.n5(this.l6().n3(), this.l6().x8()));
                     if (this.l6().n3() == 1) {
                        var1.l6.l6("stroke-linecap", "round");
                     }

                     if (this.l6().n3() == 2) {
                        var1.l6.l6("stroke-linecap", "square");
                     }
                  }
               }
            }
         }
      }
   }

   private com.aspose.slides.internal.d0e.s7 n5(String var1) {
      this.l6 = new com.aspose.slides.internal.b5j.h0();
      this.k5 = new com.aspose.slides.internal.b5j.x8();
      this.u3 = new Dictionary<>();
      this.a6 = new com.aspose.slides.internal.b5j.u9();
      com.aspose.slides.internal.d0e.s7 var2 = com.aspose.slides.internal.n1n.l6.n5(var1);
      com.aspose.slides.internal.d0e.t2 var3 = var2.u9;
      com.aspose.slides.internal.b5j.y4.n5(var3, this.l6, false);
      com.aspose.slides.internal.b5j.y4.n5(var3, this.k5, this.n5.u3());
      com.aspose.slides.internal.b5j.y4.n5(var3, false, this.u3);
      com.aspose.slides.internal.b5j.y4.n5(var3, this.n5.u3(), this.a6);
      return var2;
   }

   private void k5(com.aspose.slides.internal.d0e.t2 var1) {
      this.u3(var1);
      this.l6().n5((double)-Float.MAX_VALUE);
      this.n5().n5(-Float.MAX_VALUE);
      this.l6().n5(-Float.MAX_VALUE);
      this.n5().n5((byte)1);
      this.l6().n5((byte)1);
      this.l6().l6((byte)0);
      this.n5(var1, new k7v$3(this));
   }

   private void u3(com.aspose.slides.internal.d0e.t2 var1) {
      Dictionary$Enumerator var2 = this.k5.l6().iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            if (this.u3.containsKey((String)var3.getKey())) {
               IGenericDictionary var4 = this.u3.get_Item((String)var3.getKey());
               IGenericEnumerator var5 = var4.iterator();

               try {
                  while (var5.hasNext()) {
                     KeyValuePair var6 = (KeyValuePair)var5.next();
                     if (((com.aspose.slides.internal.d0e.t2)var3.getValue()).l6.n5((String)var6.getKey())) {
                        ((com.aspose.slides.internal.d0e.t2)var3.getValue()).l6.l6((String)var6.getKey(), (String)var6.getValue());
                     } else {
                        ((com.aspose.slides.internal.d0e.t2)var3.getValue()).l6.n5((String)var6.getKey(), (String)var6.getValue());
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                     var5.dispose();
                  }
               }

               this.n5((com.aspose.slides.internal.d0e.t2)var3.getValue(), var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      this.a6(var1);
   }

   private void a6(com.aspose.slides.internal.d0e.t2 var1) {
      for (int var2 = 0; var2 < var1.j5().n5(); var2++) {
         com.aspose.slides.internal.d0e.t2 var3 = var1.j5().l6(var2);
         if (!com.aspose.slides.internal.b5j.y4.n5(var3) && "use".equals(var3.u9)) {
            var1.j5().n5(var2--);
         }

         this.a6(var3);
      }
   }

   private void u9(com.aspose.slides.internal.d0e.t2 var1) {
      if (var1 != null) {
         switch (s7.n5(var1.u9)) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
               this.h0(var1);
         }
      }
   }

   private void h0(com.aspose.slides.internal.d0e.t2 var1) {
      com.aspose.slides.internal.d0e.k5 var2 = var1.l6;
      if (!com.aspose.slides.ms.System.d2.k5(this.l6().x8())) {
         this.l6().n5((double)this.n5((float)this.l6().x8(), var2.k5("stroke-width")));
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.l6().u9())) {
         this.l6().n5(this.n5(this.l6().u9(), var2.k5("stroke-opacity")));
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.n5().u9())) {
         this.n5().n5(this.n5(this.n5().u9(), var2.k5("fill-opacity")));
      }

      if (!this.n5().n5() && this.n5().l6() == 1 && this.n5().a6() == -1) {
         com.aspose.slides.ms.System.o5 var3 = this.l6(var2.k5("fill")).k5();
         if (com.aspose.slides.internal.o9b.c8.n5(this.n5().k5(), com.aspose.slides.internal.o9b.c8.u3) && com.aspose.slides.ms.System.o5.l6(var3, null)) {
            com.aspose.slides.ms.System.o5 var4 = var3.k5();
            if (!var4.l6()) {
               var4 = new com.aspose.slides.ms.System.o5<>(com.aspose.slides.internal.o9b.c8.u3.o8());
            }

            this.n5().n5(((com.aspose.slides.internal.o9b.c8)var4.n5()).o8());
         } else if (com.aspose.slides.ms.System.o5.l6(new com.aspose.slides.ms.System.o5<>(this.n5().k5().o8()), var3)) {
            this.n5().n5(com.aspose.slides.internal.o9b.c8.u3.o8());
            this.n5().n5((byte)-1);
         }
      }

      if (!this.l6().n5() && this.l6().l6() == 1 && this.l6().a6() == -1) {
         com.aspose.slides.ms.System.o5 var5 = this.l6(var2.k5("stroke")).k5();
         if (com.aspose.slides.internal.o9b.c8.n5(this.l6().k5(), com.aspose.slides.internal.o9b.c8.u3) && com.aspose.slides.ms.System.o5.l6(var5, null)) {
            com.aspose.slides.ms.System.o5 var7 = var5.k5();
            if (!var7.l6()) {
               var7 = new com.aspose.slides.ms.System.o5<>(com.aspose.slides.internal.o9b.c8.u3.o8());
            }

            this.l6().n5(((com.aspose.slides.internal.o9b.c8)var7.n5()).o8());
         } else if (com.aspose.slides.ms.System.o5.l6(new com.aspose.slides.ms.System.o5<>(this.l6().k5().o8()), var5)) {
            this.l6().n5(com.aspose.slides.internal.o9b.c8.u3.o8());
            this.l6().n5((byte)-1);
         }
      }

      if (this.l6().n3() != -1) {
         byte var6 = this.c8(var1);
         if (this.l6().n3() == 0) {
            this.l6().l6(var6);
         } else if (this.l6().n3() != var6) {
            this.l6().l6((byte)-1);
         }
      }
   }

   private com.aspose.slides.ms.System.o5<com.aspose.slides.internal.o9b.c8> l6(String var1) {
      if (!com.aspose.slides.ms.System.d1.n5(var1)) {
         int var2 = 0;
         int[] var3 = new int[]{0};
         boolean var4 = com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.d1.k5(var1, 1), 515, com.aspose.slides.internal.x7n.l6.k5(), var3);
         var2 = var3[0];
         if (var4) {
            return new com.aspose.slides.ms.System.o5<>(com.aspose.slides.internal.o9b.c8.n5(255, com.aspose.slides.internal.o9b.c8.n5(var2).o8()).o8());
         }
      }

      return new com.aspose.slides.ms.System.o5<>();
   }

   private float n5(float var1, String var2) {
      float var3 = this.k5(var2);
      if (var1 == -Float.MAX_VALUE) {
         return var3;
      } else {
         return var1 != var3 ? Float.NaN : var1;
      }
   }

   private float k5(String var1) {
      if (!com.aspose.slides.ms.System.d1.n5(var1)) {
         float var2 = 0.0F;
         float[] var3 = new float[]{0.0F};
         boolean var4 = com.aspose.slides.ms.System.n1.n5(com.aspose.slides.ms.System.d1.n5(var1, ',', '.'), 32, com.aspose.slides.internal.x7n.l6.k5(), var3);
         var2 = var3[0];
         if (var4) {
            return var2;
         }
      }

      return Float.NaN;
   }

   private byte c8(com.aspose.slides.internal.d0e.t2 var1) {
      com.aspose.slides.internal.d0e.k5 var2 = var1.l6;
      byte var3 = -1;
      String var4 = var2.k5("stroke-dasharray");
      String var5 = var2.k5("stroke-linecap");
      if (!com.aspose.slides.ms.System.d1.n5(var4)) {
         String[] var6 = com.aspose.slides.ms.System.d1.n5(var4, new char[]{' ', ','}, (short)1);
         int[] var7 = new int[var6.length];

         for (int var8 = 0; var8 < var6.length; var8++) {
            float var9 = 0.0F;
            float[] var10 = new float[]{0.0F};
            com.aspose.slides.ms.System.n1.n5(var6[var8], 32, com.aspose.slides.internal.x7n.l6.k5(), var10);
            var9 = var10[0];
            var7[var8] = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var9 / (float)this.l6().x8()), 14);
         }

         var3 = n1w.n5(var7);
      }

      return var3;
   }

   // $VF: synthetic method
   static void n5(k7v var0, com.aspose.slides.internal.d0e.t2 var1) {
      var0.n5(var1);
   }

   // $VF: synthetic method
   static void l6(k7v var0, com.aspose.slides.internal.d0e.t2 var1) {
      var0.l6(var1);
   }

   // $VF: synthetic method
   static void k5(k7v var0, com.aspose.slides.internal.d0e.t2 var1) {
      var0.u9(var1);
   }
}
