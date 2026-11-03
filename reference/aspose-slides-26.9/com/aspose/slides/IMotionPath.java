package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import java.awt.geom.Point2D.Float;

public interface IMotionPath extends IGenericEnumerable<IMotionCmdPath> {
   IMotionCmdPath add(int var1, Float[] var2, int var3, boolean var4);

   int getCount();

   void insert(int var1, int var2, Float[] var3, int var4, boolean var5);

   void clear();

   void remove(IMotionCmdPath var1);

   void removeAt(int var1);

   IMotionCmdPath get_Item(int var1);
}
