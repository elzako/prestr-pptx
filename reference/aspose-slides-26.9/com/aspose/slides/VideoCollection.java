package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;
import java.io.InputStream;

public class VideoCollection extends DomObject<Presentation> implements IVideoCollection {
   private final List<IVideo> n5 = new List<>();

   VideoCollection(Presentation parentImmediate) {
      super(parentImmediate);
   }

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final IVideo get_Item(int index) {
      return (Video)this.n5.get_Item(index);
   }

   @Override
   public final IVideo addVideo(IVideo video) {
      Video var2 = (Video)video;
      List$Enumerator var3 = this.n5.iterator();

      try {
         while (var3.hasNext()) {
            Video var4 = (Video)var3.next();
            if (var2 == var4) {
               return video;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return this.n5(var2.l6(), var2.getContentType(), var2.u3());
   }

   @Override
   public final IVideo addVideo(InputStream stream, int loadingStreamBehavior) {
      return this.n5(com.aspose.slides.internal.z0k.t4.fromJava(stream), loadingStreamBehavior);
   }

   IVideo n5(com.aspose.slides.internal.z0k.t4 var1, int var2) {
      com.aspose.slides.internal.q7.c8 var3;
      switch (var2) {
         case 0:
            var3 = this.u9.w1().n5(com.aspose.slides.internal.q7.n5.l6(var1), false, true);
            break;
         case 1:
            var3 = this.u9.w1().n5(var1);
            break;
         default:
            throw new ArgumentOutOfRangeException("loadingStreamBehavior", com.aspose.slides.ms.System.s3.n5(LoadingStreamBehavior.class, var2), null);
      }

      Video var4 = new Video(this, var3);
      this.n5.addItem(var4);
      return var4;
   }

   @Override
   public final IVideo addVideo(byte[] videoData) {
      return this.n5((byte[])videoData.clone(), null, null);
   }

   final Video n5(byte[] var1, String var2, String var3) {
      Video var4 = null;
      Video[] var5 = new Video[]{var4};
      boolean var6 = this.n5(var1, var5);
      var4 = var5[0];
      if (var6) {
         return var4;
      }

      com.aspose.slides.internal.q7.c8 var7 = this.u9.w1().n5(var1);
      Video var8 = new Video(this, var7, var2, var3);
      this.n5.addItem(var8);
      return var8;
   }

   private boolean n5(byte[] var1, Video[] var2) {
      var2[0] = null;
      long var3 = com.aspose.slides.internal.h3k.u3.n5(var1);
      List$Enumerator var5 = this.n5.iterator();

      try {
         while (var5.hasNext()) {
            Video var6 = (Video)var5.next();
            if ((var6.n5() & 4294967295L) == (var3 & 4294967295L) && var6.l6().length == var1.length) {
               byte[] var7 = var6.l6();
               boolean var8 = false;
               int var9 = 0;

               while (true) {
                  if (var9 < var1.length) {
                     if ((var1[var9] & 255) == (var7[var9] & 255)) {
                        var9++;
                        continue;
                     }

                     var8 = true;
                  }

                  if (!var8) {
                     var2[0] = var6;
                     return true;
                  }
                  break;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return false;
   }

   final Video n5(com.aspose.slides.internal.e5a.y2 var1, String var2, String var3) {
      boolean var4 = this.u9.a6().getBlobManagementOptions().getPresentationLockingBehavior() == 1;
      com.aspose.slides.internal.q7.c8 var5 = this.u9.w1().n5(var1, var4);
      return this.n5(var5, var2, var3);
   }

   final Video n5(com.aspose.slides.internal.q7.c8 var1, String var2, String var3) {
      Video var4 = new Video(this, var1, var2, var3);
      this.n5.addItem(var4);
      return var4;
   }

   void n5() {
      this.n5.clear();
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.n5.copyTo(array, index);
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }

   @Override
   public final IGenericEnumerator<IVideo> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final IGenericEnumerator<IVideo> iteratorJava() {
      return this.n5.iteratorJava();
   }

   final Presentation l6() {
      return this.u9;
   }
}
