package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import java.awt.geom.Point2D.Float;

public class MotionPath implements IMotionPath {
   List<IMotionCmdPath> n5 = new List<>();

   @Override
   public final IMotionCmdPath add(int type, Float[] pts, int ptsType, boolean bRelativeCoord) {
      return this.n5(type, com.aspose.slides.internal.n8e.v4.n5(pts), ptsType, bRelativeCoord);
   }

   IMotionCmdPath n5(int var1, com.aspose.slides.internal.o9b.w1[] var2, int var3, boolean var4) {
      MotionCmdPath var5 = new MotionCmdPath(var1, var2, var3, var4);
      this.n5.addItem(var5);
      return var5;
   }

   @Override
   public final int getCount() {
      return this.n5.size();
   }

   @Override
   public final void insert(int index, int type, Float[] pts, int ptsType, boolean bRelativeCoord) {
      this.n5(index, type, com.aspose.slides.internal.n8e.v4.n5(pts), ptsType, bRelativeCoord);
   }

   void n5(int var1, int var2, com.aspose.slides.internal.o9b.w1[] var3, int var4, boolean var5) {
      this.n5.insertItem(var1, new MotionCmdPath(var2, var3, var4, var5));
   }

   @Override
   public final void clear() {
      this.n5.clear();
   }

   @Override
   public final void remove(IMotionCmdPath item) {
      this.n5.removeItem(item);
   }

   @Override
   public final void removeAt(int index) {
      this.n5.removeAt(index);
   }

   @Override
   public final IMotionCmdPath get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public final IGenericEnumerator<IMotionCmdPath> iterator() {
      return this.n5.iterator();
   }

   public final IGenericEnumerator<IMotionCmdPath> iteratorJava() {
      return this.n5.iteratorJava();
   }
}
