package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class s9c implements IDisposable {
   private int n5;
   private final Dictionary<String, Dictionary<Integer, e4z>> l6 = new Dictionary<>();
   private final e6s k5 = new e6s();
   private final f8i u3 = new f8i(5, this.n5());
   private f8i a6;
   private static int u9 = 0;
   private static final f8i h0 = new f8i(com.aspose.slides.internal.e1x.n5.l6());
   private static final g1l c8 = new g1l();
   private final f8i[] t2;

   public s9c(IFontSources var1) {
      String[] var2 = null;
      byte[][] var3 = (byte[][])null;
      if (var1 != null) {
         var2 = var1.getFontFolders();
         var3 = var1.getMemoryFonts();
      }

      com.aspose.slides.internal.e1x.s7 var4 = new com.aspose.slides.internal.e1x.s7(var2, var3);
      this.a6 = new f8i(var4);
      this.t2 = new f8i[]{this.u3, this.a6, h0, c8};
   }

   public final e6s n5() {
      return this.k5;
   }

   public final e4z n5(String var1, byte var2, int var3, float var4, int var5, boolean var6, boolean var7) {
      this.u9();
      e4z var8 = null;
      Dictionary var9 = null;
      int var10 = var2 & 255;
      var10 = (var10 << 8) + (var3 & 0xFF);
      var10 = (var10 << 12) + (com.aspose.slides.internal.v6g.k5.u3(var4 * 10.0F, 13) & 4095);
      var10 = (var10 << 4) + var5;
      var10 ^= var6 ? -1 : 0;
      var10 ^= var7 ? 1515870810 : 0;
      Dictionary[] var11 = new Dictionary[]{var9};
      boolean var12 = this.l6.tryGetValue(var1, var11);
      var9 = var11[0];
      if (var12) {
         e4z[] var13 = new e4z[]{var8};
         boolean var14 = var9.tryGetValue(var10, var13);
         var8 = var13[0];
         if (var14) {
            return var8;
         }
      }

      List var25 = new List<>(com.aspose.slides.ms.System.u3.n5(this.t2));
      if (var7) {
         var25.removeAt(0);
      }

      List$Enumerator var26 = var25.iterator();

      try {
         while (var26.hasNext()) {
            f8i var15 = (f8i)var26.next();
            var8 = var15.n5(var1, var2, var3, var4, var5, var6);
            if (var8 != null) {
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var26, IDisposable.class)) {
            var26.dispose();
         }
      }

      if (var9 == null) {
         var9 = new Dictionary();
         this.l6.addItem(var1, var9);
      }

      var9.addItem(var10, var8);
      return var8;
   }

   public final com.aspose.slides.internal.o9b.n3 n5(String var1, float var2, int var3) {
      for (f8i var7 : this.t2) {
         com.aspose.slides.internal.o9b.n3 var8 = var7.n5(var1, var2, var3);
         if (var8 != null) {
            return var8;
         }
      }

      return null;
   }

   public static void n5(byte[] var0) {
      com.aspose.slides.internal.e1x.n5.l6().n5(var0);
      l6();
   }

   public static void l6() {
      h0.l6();
      u9++;
   }

   public final void k5() {
      this.u3.l6();
      this.a6();
   }

   public final void u3() {
      c8.l6();
   }

   public final void a6() {
      this.l6.clear();
   }

   @Override
   public final void dispose() {
      this.n5().dispose();

      for (f8i var4 : this.t2) {
         var4.n5();
      }

      this.u3.n5();
      this.a6.n5();
   }

   private void u9() {
      if (this.n5 != u9) {
         this.a6();
         this.n5 = u9;
      }
   }
}
