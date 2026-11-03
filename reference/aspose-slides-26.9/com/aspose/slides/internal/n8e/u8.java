package com.aspose.slides.internal.n8e;

class u8 {
   private final byte[] n5;
   private boolean l6;

   public u8(byte[] var1) {
      this.n5 = var1;
      this.u3();
   }

   public final boolean n5() {
      return this.l6;
   }

   public final String l6() {
      return "video/mp4";
   }

   public final String k5() {
      return "mp4";
   }

   private void u3() {
      if (this.n5.length >= 8) {
         com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2(this.n5);

         try {
            com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var1);

            try {
               var2.c4();
               long var3 = var2.c4();
               if (this.n5(var3)) {
                  this.l6 = true;
               }
            } finally {
               if (var2 != null) {
                  var2.dispose();
               }
            }
         } finally {
            if (var1 != null) {
               var1.dispose();
            }
         }
      }
   }

   private boolean n5(long var1) {
      String var3 = com.aspose.slides.internal.l7h.j5.z3().l6(com.aspose.slides.ms.System.x8.n5(var1));
      return "ftyp".equals(var3);
   }
}
