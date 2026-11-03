package com.aspose.slides;

import com.aspose.slides.Collections.BitArray;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.EndOfStreamException;
import com.aspose.slides.internal.DOMResourcesUtils;
import java.awt.Color;

public final class PatternFormat extends PVIObject implements IPatternFormat {
   private m5o k5;
   final com.aspose.slides.internal.v6g.n5<m5o> n5 = new PatternFormat$1(this);
   private ColorFormat u3;
   private ColorFormat a6;
   static final Dictionary<Integer, PatternFormat$n5> l6 = n5("patterns.bin");

   PatternFormat(r0g parentImmediate) {
      super(parentImmediate);
   }

   @Override
   void N_() {
      this.u3 = new ColorFormat(this, 7);
      this.a6 = new ColorFormat(this, 7);
      this.u3.n5.l6(new PatternFormat$2(this));
      this.a6.n5.l6(new PatternFormat$3(this));
   }

   @Override
   Object M_() {
      return new j3m(this.getParent_Immediate(), this.u3, this.a6);
   }

   final j3m l6() {
      return (j3m)this.m1();
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().u9();
   }

   @Override
   public final byte getPatternStyle() {
      return this.z3() ? this.l6().n5() : -1;
   }

   @Override
   public final void setPatternStyle(byte value) {
      this.n5((byte)-1, value);
      if (this.z3()) {
         this.l6().n5(value);
         this.a6();
      }
   }

   @Override
   public final IColorFormat getForeColor() {
      this.m3();
      return this.u3;
   }

   @Override
   public final IColorFormat getBackColor() {
      this.m3();
      return this.a6;
   }

   @Override
   public final IImage getTile(Color background, Color foreground) {
      return this.n5(com.aspose.slides.internal.o9b.c8.n5(background), com.aspose.slides.internal.o9b.c8.n5(foreground));
   }

   IImage n5(com.aspose.slides.internal.o9b.c8 var1, com.aspose.slides.internal.o9b.c8 var2) {
      return u4i.n5(this.l6(var1.o8(), var2.o8()));
   }

   final com.aspose.slides.internal.o9b.l6 l6(com.aspose.slides.internal.o9b.c8 var1, com.aspose.slides.internal.o9b.c8 var2) {
      return !this.z3() ? n5(false, (byte)-1, var1.o8(), var2.o8()) : this.l6().n5(var1.o8(), var2.o8());
   }

   @Override
   public final IImage getTile(Color styleColor) {
      return this.n5(com.aspose.slides.internal.o9b.c8.n5(styleColor));
   }

   IImage n5(com.aspose.slides.internal.o9b.c8 var1) {
      if (!this.z3()) {
         this.m3();
         BaseSlide var2 = this.getSlide();
         r0s var3 = new r0s(var1.o8());
         return u4i.n5(n5(false, (byte)-1, this.a6.k5(var2, var3).o8(), this.u3.k5(var2, var3).o8()));
      } else {
         return u4i.n5(this.l6().n5(var1.o8()));
      }
   }

   final void u3() {
      this.n5(true);
   }

   final void n5(boolean var1) {
      if (this.z3()) {
         this.k7();
         this.n5((Object)null);
         if (var1) {
            this.a6();
         }
      }
   }

   final void n5(PatternFormat var1) {
      if (this.z3() || var1.z3()) {
         this.k7();
         if (var1.z3()) {
            this.l6().l6(var1.l6());
         } else {
            this.n5((Object)null);
         }

         this.a6();
      }
   }

   final void n5(IPatternFormatEffectiveData var1) {
      this.k7();
      this.l6().n5(var1);
   }

   final void l6(PatternFormat var1) {
      if (this.z3() || var1.z3()) {
         this.k7();
         if (var1.z3()) {
            this.l6().n5(var1.l6());
         } else {
            this.n5((Object)null);
         }
      }
   }

   private static Dictionary<Integer, PatternFormat$n5> n5(String var0) {
      Dictionary var1 = new Dictionary();
      com.aspose.slides.internal.z0k.t4 var2 = DOMResourcesUtils.getResourceStream("templates.zip");

      try {
         com.aspose.slides.internal.e5a.d2 var3 = com.aspose.slides.internal.e5a.d2.n5(var2);

         try {
            com.aspose.slides.internal.e5a.y2 var4 = var3.l6(var0);
            com.aspose.slides.internal.e5a.t2 var5 = var4.c4();

            try {
               com.aspose.slides.internal.z0k.n5 var6 = new com.aspose.slides.internal.z0k.n5(var5);

               try {
                  boolean var7 = true;

                  try {
                     while (true) {
                        BitArray var8 = new BitArray(256, false);
                        var7 = true;
                        if (var5.getPosition() >= var5.getLength() - 2L) {
                           break;
                        }

                        short var9 = var6.k7();
                        var7 = false;
                        int var10 = var6.z1() & 255;
                        int var11 = var6.z1() & 255;
                        byte[][] var12 = new byte[var11][var10];

                        for (int var13 = 0; var13 < var11; var13++) {
                           for (int var14 = 0; var14 < var10; var14++) {
                              var12[var13][var14] = var6.z1();
                              var8.set_Item(var12[var13][var14] & 255, true);
                           }
                        }

                        PatternFormat$n5 var44 = new PatternFormat$n5();
                        var44.n5 = var12;
                        var44.l6 = 0;

                        for (int var45 = 0; var45 < var8.size(); var45++) {
                           if (var8.get_Item(var45)) {
                              var44.l6++;
                           }
                        }

                        var1.set_Item(Integer.valueOf(var9), var44);
                     }
                  } catch (EndOfStreamException var39) {
                     com.aspose.slides.internal.n8e.v4.n5(var39);
                  }

                  if (!var7) {
                     throw new PptxException("Internal error: can't initialize pattern data.");
                  }
               } finally {
                  if (var6 != null) {
                     var6.dispose();
                  }
               }
            } finally {
               if (var5 != null) {
                  var5.dispose();
               }
            }
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

      return var1;
   }

   static com.aspose.slides.internal.o9b.l6 n5(boolean var0, byte var1, com.aspose.slides.internal.o9b.c8 var2, com.aspose.slides.internal.o9b.c8 var3) {
      PatternFormat$n5 var4 = null;
      PatternFormat$n5[] var5 = new PatternFormat$n5[]{var4};
      boolean var6 = !l6.tryGetValue(Integer.valueOf(var1), var5);
      var4 = var5[0];
      if (var6) {
         var4 = l6.get_Item(1);
      }

      boolean var7 = (var2.s7() & 255) < 255 || (var3.s7() & 255) < 255;
      com.aspose.slides.internal.o9b.l6 var8 = new com.aspose.slides.internal.o9b.l6(
         com.aspose.slides.ms.System.u3.n5(var4.n5, 2).u3(1) + 1, com.aspose.slides.ms.System.u3.n5(var4.n5, 2).u3(0) + 1, var7 ? 2498570 : 137224
      );

      for (int var9 = 0; var9 <= com.aspose.slides.ms.System.u3.n5(var4.n5, 2).u3(0); var9++) {
         for (int var10 = 0; var10 <= com.aspose.slides.ms.System.u3.n5(var4.n5, 2).u3(1); var10++) {
            float var11 = (var4.n5[var9][var10] & 0xFF) / 255.0F;
            float var12 = 1.0F - var11;
            var8.n5(
               var10,
               var9,
               com.aspose.slides.internal.o9b.c8.n5(
                     com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3((var3.s7() & 0xFF) * var11 + (var2.s7() & 0xFF) * var12), 14),
                     com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3((var3.x8() & 0xFF) * var11 + (var2.x8() & 0xFF) * var12), 14),
                     com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3((var3.n3() & 0xFF) * var11 + (var2.n3() & 0xFF) * var12), 14),
                     com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3((var3.y4() & 0xFF) * var11 + (var2.y4() & 0xFF) * var12), 14)
                  )
                  .o8()
            );
         }
      }

      if (var0) {
      }

      var8.n5(72.0F, 72.0F);
      return var8;
   }

   final void a6() {
      m5o var1 = this.k5;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   // $VF: synthetic method
   static m5o n5(PatternFormat var0, m5o var1) {
      return var0.k5 = var1;
   }
}
