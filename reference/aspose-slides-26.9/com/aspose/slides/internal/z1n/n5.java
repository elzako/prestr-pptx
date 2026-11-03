package com.aspose.slides.internal.z1n;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class n5 {
   public static List<com.aspose.slides.internal.m5l.n5> n5(Collection<com.aspose.slides.internal.m5l.l6> var0) {
      boolean var1 = false;
      ArrayList var2 = new ArrayList();
      ArrayList var3 = new ArrayList();

      for (com.aspose.slides.internal.m5l.l6 var5 : var0) {
         com.aspose.slides.internal.e6a.n5 var6 = null;
         if (var5 instanceof com.aspose.slides.internal.e6a.n5) {
            var6 = (com.aspose.slides.internal.e6a.n5)var5;
         }

         if (var6 != null && var6.l6() == 15 && com.aspose.slides.internal.e6a.l6.n5(var6.k5())) {
            com.aspose.slides.internal.e6a.l6 var8 = new com.aspose.slides.internal.e6a.l6(var6.k5());
            if (!var8.n5()) {
               throw new com.aspose.slides.internal.p7x.l6("META_ESCAPE_ENHANCED_METAFILE record contains invalid data.");
            }

            var2.add(var8);
            var1 = true;
         } else if (var1) {
            com.aspose.slides.internal.m5l.n5 var7 = n5((java.util.List<com.aspose.slides.internal.e6a.l6>)(var2));
            var3.add(var7);
            var2.clear();
            var1 = false;
         }
      }

      return var3;
   }

   private static com.aspose.slides.internal.m5l.n5 n5(List<com.aspose.slides.internal.e6a.l6> var0) {
      com.aspose.slides.internal.e6a.l6 var1 = (com.aspose.slides.internal.e6a.l6)var0.get(0);
      if (var0.size() != var1.l6) {
         throw new com.aspose.slides.internal.p7x.l6("Unexpected end of META_ESCAPE_ENHANCED_METAFILE records sequence.");
      }

      byte[] var2 = new byte[(int)var1.a6];
      int var3 = 0;

      for (com.aspose.slides.internal.e6a.l6 var5 : var0) {
         if (var5.k5 + var3 > var2.length) {
            throw new com.aspose.slides.internal.p7x.l6("Invalid size of a META_ESCAPE_ENHANCED_METAFILE record in the sequence.");
         }

         System.arraycopy(var5.u9, 0, var2, var3, (int)var5.k5);
         var3 = (int)(var3 + var5.k5);
      }

      return new com.aspose.slides.internal.m5l.n5(new ByteArrayInputStream(var2));
   }
}
