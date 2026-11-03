package com.aspose.slides.internal.r3;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.q7.c8;
import com.aspose.slides.internal.z0k.t4;

public class u3 implements c8 {
   private final t4 n5;
   private byte[] l6;
   private com.aspose.slides.internal.q8.n5 k5;

   public u3(t4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("sourceStream");
      }

      if (!var1.canSeek()) {
         throw new ArgumentException("Stream should be seekable", "sourceStream");
      }

      this.n5 = var1;
   }

   @Override
   public final byte[] n5() {
      if (this.l6 == null) {
         this.u3();
         this.l6 = com.aspose.slides.internal.q7.n5.n5(this.n5);
      }

      return this.l6;
   }

   @Override
   public final t4 l6() {
      if (this.k5 != null && !this.k5.l6()) {
         throw new InvalidOperationException("Stream is already opened and not closed");
      }

      this.u3();
      this.k5 = new com.aspose.slides.internal.q8.n5(this.n5);
      return this.k5;
   }

   @Override
   public final long k5() {
      return com.aspose.slides.internal.v6g.k5.h0(this.l6 == null ? 0 : this.l6.length, 9);
   }

   @Override
   public final void dispose() {
      if (this.k5 != null && !this.k5.l6()) {
         this.k5.dispose();
      }

      this.k5 = null;
   }

   private void u3() {
      this.n5.seek(0L, 0);
   }
}
