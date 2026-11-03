package com.aspose.slides;

final class f7b {
   private final ParagraphFormat[] n5;
   private com.aspose.slides.ms.System.o5<Integer> l6 = new com.aspose.slides.ms.System.o5<>();
   private final TextStyle k5;
   private long u3;

   f7b(ParagraphFormat var1, TextStyle var2) {
      this.k5 = var2;
      this.l6 = new com.aspose.slides.ms.System.o5<>();
      this.n5 = new ParagraphFormat[10];
      this.n5[0] = var1;
   }

   public final IParagraphFormat n5(int var1) {
      return this.n5[var1 + 1];
   }

   public final IParagraphFormat n5() {
      return this.n5[0];
   }

   final ParagraphFormat[] l6() {
      return this.n5;
   }

   final com.aspose.slides.ms.System.o5<Integer> k5() {
      return this.l6;
   }

   final void n5(com.aspose.slides.ms.System.o5<Integer> var1) {
      var1.n5(this.l6);
   }

   final void l6(int var1) {
      this.n5[var1] = new ParagraphFormat(this.k5);
      this.u9();
   }

   final void n5(int var1, ParagraphFormat var2) {
      this.n5[var1] = new ParagraphFormat(var2, this.k5);
      this.u9();
   }

   final void n5(TextStyle var1) {
      for (int var2 = 0; var2 < var1.u3().length; var2++) {
         if (var1.u3()[var2] != null) {
            if (this.n5[var2] == null) {
               this.n5[var2] = new ParagraphFormat(this.k5);
            }

            this.n5[var2].n5(var1.u3()[var2]);
         } else {
            this.n5[var2] = null;
         }
      }

      this.u9();
   }

   final void n5(n1x var1) {
      this.n5[0].n5((t3x)var1.getDefaultParagraphFormat());

      for (int var2 = 0; var2 <= 8; var2++) {
         t3x var3 = var1.n5(var2);
         if (var3 != null) {
            if (this.n5[var2 + 1] == null) {
               this.n5[var2 + 1] = new ParagraphFormat(this.k5);
            }

            this.n5[var2 + 1].n5(var3);
         } else {
            this.n5[var2 + 1] = null;
         }
      }

      this.u9();
   }

   final void l6(TextStyle var1) {
      for (int var2 = 0; var2 < var1.u3().length; var2++) {
         if (var1.u3()[var2] != null) {
            if (this.n5[var2] == null) {
               this.n5[var2] = new ParagraphFormat(this.k5);
            }

            this.n5[var2].n5((IParagraphFormat)var1.u3()[var2]);
         } else {
            this.n5[var2] = null;
         }
      }

      this.u9();
   }

   final void k5(TextStyle var1) {
      TextStyle var2 = this.k5;

      for (int var3 = 0; var3 < var1.u3().length; var3++) {
         if (var1.u3()[var3] != null) {
            if (this.n5[var3] != null) {
               this.n5[var3].k5(var1.u3()[var3]);
            } else {
               this.n5[var3] = new ParagraphFormat(var1.u3()[var3], this.k5);
            }
         }
      }

      this.u9();
   }

   final IParagraphFormat k5(int var1) {
      if (this.n5[var1 + 1] == null) {
         this.l6(var1 + 1);
      }

      return this.n5[var1 + 1];
   }

   final ParagraphFormat n5(ParagraphFormat var1) {
      return var1 == null ? this.u3(-1) : this.n5[0].u3(var1);
   }

   final ParagraphFormat l6(int var1, ParagraphFormat var2) {
      if (var2 == null) {
         return this.u3(var1);
      } else {
         return this.n5[var1 + 1] != null ? this.n5[var1 + 1].u3(var2) : var2;
      }
   }

   final ParagraphFormat u3(int var1) {
      return this.n5[var1 + 1] != null ? new ParagraphFormat(this.n5[var1 + 1], this.k5) : null;
   }

   final void u3() {
      for (int var1 = 0; var1 < 9; var1++) {
         this.n5[var1 + 1] = null;
      }
   }

   final boolean u3(TextStyle var1) {
      for (int var2 = 0; var2 < var1.u3().length; var2++) {
         ParagraphFormat var3 = var1.u3()[var2];
         ParagraphFormat var4 = this.n5[var2];
         if (var3 != null) {
            if (var4 == null || !var4.l6((IParagraphFormat)var3)) {
               return false;
            }
         } else if (var4 != null) {
            return false;
         }
      }

      return true;
   }

   private void u9() {
      this.u3++;
   }

   final long a6() {
      long var1 = this.u3;

      for (ParagraphFormat var6 : this.n5) {
         if (var6 != null) {
            var1 = (var1 & 4294967295L) + (var6.getVersion() & 4294967295L) & 4294967295L;
         }
      }

      return var1;
   }

   @Override
   public boolean equals(Object obj) {
      TextStyle var2 = com.aspose.slides.internal.v6g.k5.n5(obj, TextStyle.class);
      if (var2 == null) {
         return false;
      }

      for (int var3 = 0; var3 < this.n5.length; var3++) {
         if (!com.aspose.slides.ms.System.j8.n5(this.n5[var3], var2.u3()[var3])) {
            return false;
         }
      }

      return true;
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(new String[]{"TextStyle: ", this.l6.toString()});
   }
}
