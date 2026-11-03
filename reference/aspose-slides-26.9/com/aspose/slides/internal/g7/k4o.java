package com.aspose.slides.internal.g7;

import com.aspose.slides.exceptions.ArgumentException;

class k4o {
   private static final String[] n5 = new String[]{
      "ttcf",
      "cmap",
      "head",
      "hhea",
      "hmtx",
      "maxp",
      "name",
      "OS/2",
      "post",
      "cvt ",
      "fpgm",
      "glyf",
      "loca",
      "prep",
      "CFF ",
      "VORG",
      "EBDT",
      "EBLC",
      "EBSC",
      "BASE",
      "GDEF",
      "GPOS",
      "GSUB",
      "JSTF",
      "DSIG",
      "gasp",
      "hdmx",
      "kern",
      "LTSH",
      "PCLT",
      "VDMX",
      "vhea",
      "vmtx",
      "bsln",
      "feat",
      "lcar",
      "morx",
      "opbd",
      "prop",
      "Feat",
      "Glat",
      "Gloc",
      "Sile",
      "Silf",
      "bhed",
      "bdat",
      "bloc"
   };

   public static long n5(String var0) {
      if (var0.length() != 4) {
         throw new ArgumentException("Length of tag must be 4", "tag");
      }

      byte[] var1 = com.aspose.slides.internal.l7h.j5.e2().u3(var0);
      return com.aspose.slides.internal.v6g.k5.a6(
         com.aspose.slides.internal.v6g.k5.u3(var1[0], 6) << 24
            | com.aspose.slides.internal.v6g.k5.u3(var1[1], 6) << 16
            | com.aspose.slides.internal.v6g.k5.u3(var1[2], 6) << 8
            | com.aspose.slides.internal.v6g.k5.u3(var1[3], 6),
         9
      );
   }

   public static String n5(long var0) {
      byte[] var2 = new byte[]{
         com.aspose.slides.internal.v6g.k5.n5((Object)(255L & com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(var0, 10) >> 24, 10)), 10),
         com.aspose.slides.internal.v6g.k5.n5((Object)(255L & com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(var0, 10) >> 16, 10)), 10),
         com.aspose.slides.internal.v6g.k5.n5((Object)(255L & com.aspose.slides.internal.v6g.k5.a6(com.aspose.slides.internal.v6g.k5.a6(var0, 10) >> 8, 10)), 10),
         com.aspose.slides.internal.v6g.k5.n5((Object)(255L & com.aspose.slides.internal.v6g.k5.a6(var0, 10)), 10)
      };
      String var3 = com.aspose.slides.internal.l7h.j5.e2().l6(var2);
      l6(var3);
      return var3;
   }

   private static boolean l6(String var0) {
      boolean var1 = false;

      for (String var5 : n5) {
         if (com.aspose.slides.ms.System.d1.a6(var0, var5)) {
            var1 = true;
            break;
         }
      }

      return var1;
   }
}
