package com.aspose.slides.internal.u1;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public abstract class t2 extends u3 {
   private float a6;
   private float u9;
   private com.aspose.slides.internal.x2.k5 h0;
   private char[] c8;
   private final Dictionary<Integer, Float> t2 = new Dictionary<>();
   private final byte[] s7 = new byte[]{32};

   public t2() {
      this.m3();
   }

   public final com.aspose.slides.internal.x2.k5 k7() {
      return this.h0;
   }

   public t2(com.aspose.slides.internal.v2.k5 var1) {
      super(var1);
      this.m3();
      this.z8();
   }

   public final void m3() {
      this.a6 = -1.0F;
      this.u9 = 0.0F;
      this.h0 = this.y4();
      this.n5();
   }

   private void n5() {
      com.aspose.slides.internal.g4.a6 var1 = this.s7();
      int[] var2 = var1.l6();
      if (var2.length != 0) {
         this.c8 = new char[256];

         for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var2[var3];
            if (var4 <= 255) {
               this.c8[var4] = (char)var1.n5(var4);
            }
         }

         if (this.h0 != null) {
            IGenericDictionary var10 = this.h0.a6();
            IGenericEnumerator var12 = var10.iterator();

            try {
               while (var12.hasNext()) {
                  KeyValuePair var5 = (KeyValuePair)var12.next();
                  if ((Integer)var5.getKey() < 256) {
                     this.c8[(Integer)var5.getKey()] = (char)((Integer)var5.getValue()).intValue();
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
                  var12.dispose();
               }
            }
         }

         com.aspose.slides.internal.g4.a6 var11 = this.x8();
         if (var11 != null) {
            var2 = var11.l6();

            for (int var13 = 0; var13 < var2.length; var13++) {
               int var14 = var11.n5(var2[var13]);
               if (var14 < 256) {
                  this.c8[var14] = (char)var2[var13];
               }
            }
         }
      }
   }

   public final String u9(byte[] var1, int var2, int var3) {
      if (this.h0 != null) {
         if (var2 + var3 > var1.length) {
            String var5 = d1.n5("Invalid index '{0}'", new Object[]{var2 + var3});
            throw new IndexOutOfRangeException(var5);
         }

         String var4 = this.h0.n5(var1, var2, var3);
         if (var4 != null) {
            return var4;
         }

         if (var3 != 1 || this.c8 == null) {
            return null;
         }
      }

      if (var3 != 1) {
         throw new ArgumentException("Multi-byte glyphs not implemented yet");
      } else {
         return this.c8 == null ? d1.n5 : d1.n5(this.c8, 0xFF & var1[var2] & 255, 1);
      }
   }

   @Override
   public String k5(byte[] var1, int var2, int var3) {
      a5 var4 = new a5();
      String var5 = d1.n5;

      for (int var6 = var2; var6 < var2 + var3; var6++) {
         String var7 = this.u9(var1, var6, 1);
         if (var7 == null && var6 < var2 + var3 - 1) {
            var7 = this.u9(var1, var6, 2);
            var6++;
         }

         if (var7 != null) {
            var4.n5(var7);
         }
      }

      var5 = var4.toString();
      if (d1.n5(var5) && this.u3() != null) {
         int var9 = this.a6(var1, var2, var3);
         var5 = this.u3().l6(var9);
      }

      return var5;
   }

   public final void z8() {
      String var1 = null;
      com.aspose.slides.internal.v2.c8 var2 = null;
      com.aspose.slides.internal.v2.s7 var3 = this.k5();
      com.aspose.slides.internal.p2.l6 var4 = null;
      if (var3 != null) {
         if (com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.v2.c8.class)) {
            if (this.h0 == null) {
               var2 = (com.aspose.slides.internal.v2.c8)var3;
               var1 = var2.n5();
            }

            if (this.h0 == null && var1 != null) {
               try {
                  var4 = com.aspose.slides.internal.p2.k5.n5.n5(var2);
               } catch (IOException var7) {
               }
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.v2.k5.class)) {
            try {
               var4 = new com.aspose.slides.internal.p2.n5((com.aspose.slides.internal.v2.k5)var3);
            } catch (IOException var6) {
            }
         }
      }

      this.n5(var4);
   }

   @Override
   public float l6(byte[] var1, int var2, int var3) {
      if (this.u9 > 0.0F) {
         return this.u9;
      }

      float var4 = 0.0F;
      a6 var5 = this.t4();
      if (var5 != null) {
         com.aspose.slides.internal.e7.c8 var6 = var5.h0();
         if (var6 != null) {
            var4 = var6.a6() / 2.0F;
         }

         if (var4 == 0.0F) {
            var4 = var5.n5();
         }

         if (var4 == 0.0F) {
            var4 = var5.k5();
         }

         if (var4 == 0.0F) {
            var4 = var5.l6();
            if (var4 > 0.0F) {
               var4 -= var5.u3();
            }
         }

         this.u9 = var4;
      }

      return var4;
   }

   @Override
   public float q0() {
      if (this.a6 == -1.0F) {
         com.aspose.slides.internal.v2.s7 var1 = this.z3();

         try {
            if (var1 != null) {
               if (this.h0 != null) {
                  int var2 = this.h0.l6();
                  if (var2 > -1) {
                     this.a6 = this.n5(var2);
                  }
               }
            } else {
               this.a6 = this.n5(this.s7, 0, 1);
            }

            if (this.a6 <= 0.0F) {
               this.a6 = this.l6();
            }
         } catch (RuntimeException var3) {
            this.a6 = 250.0F;
         }
      }

      return this.a6;
   }

   @Override
   public float n5(byte[] var1, int var2, int var3) {
      int var4 = this.a6(var1, var2, var3);
      float var5 = 0.0F;
      if (!this.t2.containsKey(var4)) {
         var5 = this.n5(var4);
         this.t2.addItem(var4, var5);
      } else {
         var5 = this.t2.get_Item(var4);
      }

      return var5;
   }
}
