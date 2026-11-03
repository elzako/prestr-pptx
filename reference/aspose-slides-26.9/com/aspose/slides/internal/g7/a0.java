package com.aspose.slides.internal.g7;

class a0 extends j2 {
   private int k5;

   public a0(m1 var1, int var2) {
      super(var1);
      this.k5 = var2;
   }

   public final int n5() {
      byte var1 = this.n5.n5(this.l6);
      if (com.aspose.slides.internal.v6g.k5.u3(var1, 6) != 28
         && (com.aspose.slides.internal.v6g.k5.u3(var1, 6) < 32 || com.aspose.slides.internal.v6g.k5.u3(var1, 6) >= 255)) {
         if (com.aspose.slides.internal.v6g.k5.u3(var1, 6) != 255) {
            return 0;
         } else {
            return this.k5 == 2 ? 2 : 1;
         }
      } else {
         return 1;
      }
   }

   public final int l6() {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(this.l6), 6);
   }

   public final int k5() {
      byte var1 = this.n5.n5(this.l6);
      if (com.aspose.slides.internal.v6g.k5.u3(var1, 6) == 28) {
         if (this.l6 + 2 < this.n5.l6()) {
            int var2 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
            int var3 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
            return (short)(var2 << 8 | var3);
         }
      } else {
         if (com.aspose.slides.internal.v6g.k5.u3(var1, 6) <= 246) {
            return com.aspose.slides.internal.v6g.k5.u3(var1, 6) - 139;
         }

         if (com.aspose.slides.internal.v6g.k5.u3(var1, 6) <= 250) {
            if (this.l6 + 1 < this.n5.l6()) {
               int var6 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
               return (com.aspose.slides.internal.v6g.k5.u3(var1, 6) - 247) * 256 + var6 + 108;
            }
         } else if (com.aspose.slides.internal.v6g.k5.u3(var1, 6) <= 254) {
            if (this.l6 + 1 < this.n5.l6()) {
               int var7 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
               return -((com.aspose.slides.internal.v6g.k5.u3(var1, 6) - 251) * 256) - var7 - 108;
            }
         } else if (com.aspose.slides.internal.v6g.k5.u3(var1, 6) == 255 && this.l6 + 4 < this.n5.l6()) {
            int var8 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
            int var9 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
            int var4 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
            int var5 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
            return var8 << 24 | var9 << 16 | var4 << 8 | var5;
         }
      }

      return 0;
   }

   public final double u3() {
      byte var1 = this.n5.n5(this.l6);
      if (com.aspose.slides.internal.v6g.k5.u3(var1, 6) == 255 && this.l6 + 4 < this.n5.l6()) {
         int var2 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
         int var3 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
         int var4 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
         int var5 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(++this.l6), 6);
         short var6 = (short)(var2 << 8 | var3);
         int var7 = var4 << 8 | var5;
         return var6 + var7 / 65536.0;
      } else {
         return 0.0;
      }
   }

   public final String a6() {
      byte var1 = this.n5.n5(this.l6);
      if (com.aspose.slides.internal.v6g.k5.u3(var1, 6) > 31) {
         throw new g6("Unexpected PS object type in PS program.");
      }

      switch (var1) {
         case 1:
            return "hstem";
         case 2:
         case 9:
         case 13:
         case 15:
         case 16:
         case 17:
         case 28:
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
         case 10:
            return "callsubr";
         case 11:
            return "return";
         case 12:
            if (this.l6 + 1 < this.n5.l6()) {
               this.l6++;
               int var2 = com.aspose.slides.internal.v6g.k5.u3(this.n5.n5(this.l6), 6);
               switch (var2) {
                  case 3:
                     return "and";
                  case 4:
                     return "or";
                  case 5:
                     return "not";
                  case 6:
                  case 7:
                  case 8:
                  case 13:
                  case 16:
                  case 17:
                  case 19:
                  case 25:
                  case 31:
                  case 32:
                  case 33:
                  default:
                     return "N/A";
                  case 9:
                     return "abs";
                  case 10:
                     return "add";
                  case 11:
                     return "sub";
                  case 12:
                     return "div";
                  case 14:
                     return "neg";
                  case 15:
                     return "eq";
                  case 18:
                     return "drop";
                  case 20:
                     return "put";
                  case 21:
                     return "get";
                  case 22:
                     return "ifelse";
                  case 23:
                     return "random";
                  case 24:
                     return "mul";
                  case 26:
                     return "sqrt";
                  case 27:
                     return "dup";
                  case 28:
                     return "exch";
                  case 29:
                     return "index";
                  case 30:
                     return "roll";
                  case 34:
                     return "hflex";
                  case 35:
                     return "flex";
                  case 36:
                     return "hflex1";
                  case 37:
                     return "flex1";
               }
            }

            return "N/A";
         case 14:
            return "endchar";
         case 18:
            return "hstemhm";
         case 19:
            return "hintmask";
         case 20:
            return "cntrmask";
         case 21:
            return "rmoveto";
         case 22:
            return "hmoveto";
         case 23:
            return "vstemhm";
         case 24:
            return "rcurveline";
         case 25:
            return "rlinecurve";
         case 26:
            return "vvcurveto";
         case 27:
            return "hhcurveto";
         case 29:
            return "callgsubr";
         case 30:
            return "vhcurveto";
         case 31:
            return "hvcurveto";
      }
   }
}
