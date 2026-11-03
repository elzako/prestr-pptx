package com.aspose.slides.internal.q8;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.z0k.t4;

public class n5 extends t4 {
   private final t4 n5;
   private boolean l6;

   public n5(t4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("sourceStream");
      }

      if (!var1.canSeek()) {
         throw new ArgumentException("Stream should be seekable", "sourceStream");
      }

      this.n5 = var1;
   }

   @Override
   public void flush() {
      this.n5.flush();
   }

   @Override
   public long seek(long offset, int origin) {
      return this.n5.seek(offset, origin);
   }

   @Override
   public void setLength(long value) {
      this.n5.setLength(value);
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      return this.n5.read(buffer, offset, count);
   }

   @Override
   public void write(byte[] buffer, int offset, int count) {
      this.n5.write(buffer, offset, count);
   }

   @Override
   public boolean canRead() {
      return this.n5.canRead();
   }

   @Override
   public boolean canSeek() {
      return this.n5.canSeek();
   }

   @Override
   public boolean canWrite() {
      return this.n5.canWrite();
   }

   @Override
   public long getLength() {
      return this.n5.getLength();
   }

   @Override
   public long getPosition() {
      return this.n5.getPosition();
   }

   @Override
   public void setPosition(long value) {
      this.n5.setPosition(value);
   }

   public final t4 n5() {
      return this.n5;
   }

   public final boolean l6() {
      return this.l6;
   }

   @Override
   protected void dispose(boolean disposing) {
      super.dispose(disposing);
      this.l6 = true;
   }
}
