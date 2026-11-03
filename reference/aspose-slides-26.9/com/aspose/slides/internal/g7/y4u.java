package com.aspose.slides.internal.g7;

class y4u extends j2 {
   public y4u(m1 var1) {
      super(var1);
   }

   public final int n5() {
      byte var1 = this.n5.n5(this.l6);
      return com.aspose.slides.internal.v6g.k5.u3(var1, 6) <= 31 ? 0 : 1;
   }

   public final int l6() {
      byte var1 = this.n5.n5(this.l6);
      if (com.aspose.slides.internal.v6g.k5.u3(var1, 6) <= 31) {
         throw new g6("Unexpected PS object type in PS program.");
      }

      if (com.aspose.slides.internal.v6g.k5.u3(var1, 6) <= 246) {
         return com.aspose.slides.internal.v6g.k5.u3(var1, 6) - 139;
      }

      if (com.aspose.slides.internal.v6g.k5.u3(var1, 6) <= 250) {
         if (this.l6 + 1 < this.n5.l6()) {
            int var2 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
            return (com.aspose.slides.internal.v6g.k5.u3(var1, 6) - 247) * 256 + var2 + 108;
         }
      } else if (com.aspose.slides.internal.v6g.k5.u3(var1, 6) <= 254) {
         if (this.l6 + 1 < this.n5.l6()) {
            int var6 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
            return -((com.aspose.slides.internal.v6g.k5.u3(var1, 6) - 251) * 256) - var6 - 108;
         }
      } else if (this.l6 + 4 < this.n5.l6()) {
         int var7 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
         int var3 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
         int var4 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
         int var5 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
         return var7 << 24 | var3 << 16 | var4 << 8 | var5;
      }

      return 0;
   }

   public final double k5() {
      return 0.0;
   }

   public final String u3() {
      byte var1 = this.n5.n5(this.l6);
      if (com.aspose.slides.internal.v6g.k5.u3(var1, 6) > 31) {
         throw new g6("Unexpected PS object type in PS program.");
      }

      switch (var1) {
         case 1:
            return "hstem";
         case 2:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         default:
            return "N/A";
         case 3:
            return "vstem";
         case 4:
            return "vmoveto";
         case 5:
            return "rlineto";
         case 6:
            return "hlineto";
         case 7:
            return "vlineto";
         case 8:
            return "rrcurveto";
         case 9:
            return "closepath";
         case 10:
            return "callsubr";
         case 11:
            return "return";
         case 12:
            if (this.l6 + 1 < this.n5.l6()) {
               this.l6++;
               int var2 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(this.l6), 6);
               switch (var2) {
                  case 0:
                     return "dotsection";
                  case 1:
                     return "vstem3";
                  case 2:
                     return "hstem3";
                  case 3:
                  case 4:
                  case 5:
                  case 8:
                  case 9:
                  case 10:
                  case 11:
                  case 13:
                  case 14:
                  case 15:
                  case 18:
                  case 19:
                  case 20:
                  case 21:
                  case 22:
                  case 23:
                  case 24:
                  case 25:
                  case 26:
                  case 27:
                  case 28:
                  case 29:
                  case 30:
                  case 31:
                  case 32:
                  default:
                     return "N/A";
                  case 6:
                     return "seac";
                  case 7:
                     return "sbw";
                  case 12:
                     return "div";
                  case 16:
                     return "callothersubr";
                  case 17:
                     return "pop";
                  case 33:
                     return "setcurrentpoint";
               }
            }

            return "N/A";
         case 13:
            return "hsbw";
         case 14:
            return "endchar";
         case 21:
            return "rmoveto";
         case 22:
            return "hmoveto";
         case 30:
            return "vhcurveto";
         case 31:
            return "hvcurveto";
      }
   }
}
