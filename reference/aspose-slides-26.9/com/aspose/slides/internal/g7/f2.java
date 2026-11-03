package com.aspose.slides.internal.g7;

class f2 extends j2 {
   public f2(m1 var1) {
      super(var1);
   }

   public final int n5() {
      byte var1 = this.n5.n5(this.l6);
      if ((com.aspose.slides.internal.v6g.k5.u3(var1, 6) < 28 || com.aspose.slides.internal.v6g.k5.u3(var1, 6) > 29)
         && (com.aspose.slides.internal.v6g.k5.u3(var1, 6) < 32 || com.aspose.slides.internal.v6g.k5.u3(var1, 6) > 254)) {
         return com.aspose.slides.internal.v6g.k5.u3(var1, 6) == 30 ? 2 : 0;
      } else {
         return 1;
      }
   }

   public final int l6() {
      byte var1 = this.n5.n5(this.l6);
      if (com.aspose.slides.internal.v6g.k5.u3(var1, 6) == 28) {
         if (this.l6 + 2 < this.n5.l6()) {
            int var2 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
            int var3 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
            return (short)(var2 << 8 | var3);
         }
      } else if (com.aspose.slides.internal.v6g.k5.u3(var1, 6) == 29) {
         if (this.l6 + 4 < this.n5.l6()) {
            int var6 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
            int var9 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
            int var4 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
            int var5 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
            return var6 << 24 | var9 << 16 | var4 << 8 | var5;
         }
      } else {
         if (com.aspose.slides.internal.v6g.k5.u3(var1, 6) <= 246) {
            return com.aspose.slides.internal.v6g.k5.u3(var1, 6) - 139;
         }

         if (com.aspose.slides.internal.v6g.k5.u3(var1, 6) <= 250) {
            if (this.l6 + 1 < this.n5.l6()) {
               int var7 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
               return (com.aspose.slides.internal.v6g.k5.u3(var1, 6) - 247) * 256 + var7 + 108;
            }
         } else if (com.aspose.slides.internal.v6g.k5.u3(var1, 6) <= 254 && this.l6 + 1 < this.n5.l6()) {
            int var8 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
            return -((com.aspose.slides.internal.v6g.k5.u3(var1, 6) - 251) * 256) - var8 - 108;
         }
      }

      return 0;
   }

   public final double k5() {
      byte var1 = this.n5.n5(++this.l6);
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();
      boolean var3 = true;
      boolean var4 = false;

      while (!var4) {
         byte var5;
         if (var3) {
            var5 = (byte)(com.aspose.slides.internal.v6g.k5.u3(var1, 6) >> 4);
         } else {
            var5 = (byte)(com.aspose.slides.internal.v6g.k5.u3(var1, 6) & 15);
         }

         if (com.aspose.slides.internal.v6g.k5.u3(var5, 6) >= 0 && com.aspose.slides.internal.v6g.k5.u3(var5, 6) <= 9) {
            var2.n5(var5);
         } else {
            switch (var5) {
               case 10:
                  var2.n5(com.aspose.slides.internal.x7n.l6.k5().e2().q0());
                  break;
               case 11:
                  var2.n5("E");
                  break;
               case 12:
                  var2.n5("E-");
               case 13:
               default:
                  break;
               case 14:
                  var2.n5("-");
                  break;
               case 15:
                  var4 = true;
            }
         }

         if (var4) {
            break;
         }

         var3 = !var3;
         if (var3) {
            var1 = this.n5.n5(++this.l6);
         }
      }

      return com.aspose.slides.ms.System.d2.n5(var2.toString(), com.aspose.slides.internal.x7n.l6.k5());
   }

   public final String u3() {
      byte var1 = this.n5.n5(this.l6);
      if (com.aspose.slides.internal.v6g.k5.u3(var1, 6) > 31) {
         throw new g6("Unexpected PS object type in PS program.");
      }

      switch (var1) {
         case 0:
            return "version";
         case 1:
            return "Notice";
         case 2:
            return "FullName";
         case 3:
            return "FamilyName";
         case 4:
            return "Weight";
         case 5:
            return "FontBBox";
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         default:
            return "N/A";
         case 12:
            if (this.l6 + 1 < this.n5.l6()) {
               this.l6++;
               int var2 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(this.l6), 6);
               switch (var2) {
                  case 0:
                     return "Copyright";
                  case 1:
                     return "isFixedPitch";
                  case 2:
                     return "ItalicAngle";
                  case 3:
                     return "UnderlinePosition";
                  case 4:
                     return "UnderlineThickness";
                  case 5:
                     return "PaintType";
                  case 6:
                     return "CharstringType";
                  case 7:
                     return "FontMatrix";
                  case 8:
                     return "StrokeWidth";
                  case 9:
                  case 10:
                  case 11:
                  case 12:
                  case 13:
                  case 14:
                  case 15:
                  case 16:
                  case 17:
                  case 18:
                  case 19:
                  case 24:
                  case 25:
                  case 26:
                  case 27:
                  case 28:
                  case 29:
                  default:
                     return "N/A";
                  case 20:
                     return "SyntheticBase";
                  case 21:
                     return "PostScript";
                  case 22:
                     return "BaseFontName";
                  case 23:
                     return "BaseFontBlend";
                  case 30:
                     return "ROS";
                  case 31:
                     return "CIDFontVersion";
                  case 32:
                     return "CIDFontRevision";
                  case 33:
                     return "CIDFontType";
                  case 34:
                     return "CIDCount";
                  case 35:
                     return "UIDBase";
                  case 36:
                     return "FDArray";
                  case 37:
                     return "FDSelect";
                  case 38:
                     return "FontName";
               }
            }

            return "N/A";
         case 13:
            return "UniqueID";
         case 14:
            return "XUID";
         case 15:
            return "charset";
         case 16:
            return "Encoding";
         case 17:
            return "CharStrings";
         case 18:
            return "Private";
      }
   }

   public static byte[] n5(int var0) {
      return new byte[]{29, (byte)(var0 >> 24), (byte)(var0 >> 16), (byte)(var0 >> 8), (byte)var0};
   }
}
