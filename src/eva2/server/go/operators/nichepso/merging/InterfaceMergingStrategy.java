package eva2.server.go.operators.nichepso.merging;

import java.util.Vector;

import eva2.server.go.strategies.ParticleSubSwarmOptimization;


/**
 * interface for the merging strategies used in NichePSO
 */
public interface InterfaceMergingStrategy {

	/**
	 * decides whether the two subswarms should be merged according to the merging strategie
	 * @param subswarm1
	 * @param subswarm2
	 * @return
	 */
	public abstract boolean shouldMergeSubswarms(
			ParticleSubSwarmOptimization subswarm1, 
			ParticleSubSwarmOptimization subswarm2);
	
	/**
	 * Merges the i. and j. subswarm from subSwarms.
	 * The meaning of this depends on the concrete strategy but two aspects schould be taken care of:
	 * 1. the overall population size (in all subSwarms and the mainSwarm) should remain constant
	 * 2. call populationSizeHasChanged() for changed swarms
	 * @param i
	 * @param j
	 * @param subSwarms
	 * @param mainSwarm
	 */
	public abstract void mergeSubswarms(
			int i, 
			int j, 
			Vector<ParticleSubSwarmOptimization> subSwarms, 
			ParticleSubSwarmOptimization mainSwarm);

	public abstract Object clone();
}
