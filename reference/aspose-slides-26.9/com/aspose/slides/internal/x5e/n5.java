package com.aspose.slides.internal.x5e;

import com.aspose.slides.internal.g9t.l6;
import com.aspose.slides.internal.j3b.c8;
import com.aspose.slides.internal.l4o.k5;
import com.aspose.slides.internal.y5s.j5;
import com.aspose.slides.internal.y5s.z3;
import com.aspose.slides.internal.z0k.e2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class n5 implements c8 {
   private final k5 n5;
   private ByteArrayOutputStream l6;
   private DeflaterOutputStream k5;
   private int u3;

   public n5(k5 var1, int var2) {
      this.n5 = var1;
      this.u3 = var2;
      this.l6 = new ByteArrayOutputStream();
      Deflater var3 = new Deflater(var2);
      this.k5 = new DeflaterOutputStream(this.l6, var3);
   }

   public void n5() {
      try {
         this.k5.finish();
         this.k5.close();
      } catch (IOException var6) {
         throw new l6("Could not close DeflaterOutputStream");
      }

      e2 var1 = new e2(this.l6.toByteArray());
      var1.seek(0L, 0);
      byte[] var2 = com.aspose.slides.internal.y5s.n5.n5(32767L);

      int var3;
      while ((var3 = var1.read(var2, 0, var2.length)) > 0) {
         byte[] var4 = new byte[var3];
         System.arraycopy(var2, 0, var4, 0, var3);
         com.aspose.slides.internal.a2w.k5 var5 = new com.aspose.slides.internal.a2w.k5();
         var5.n5(var4);
         var5.n5(this.n5);
      }

      var1.dispose();
   }

   @Override
   public void n5(j5 var1, byte[] var2, z3 var3, z3 var4) {
      try {
         this.k5.write(var2, 0, var2.length);
      } catch (IOException var6) {
         throw new l6("Could not write data");
      }
   }
}
